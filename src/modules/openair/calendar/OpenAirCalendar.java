package modules.openair.calendar;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import modules.openair.objects.CSOASession;
import modules.openair.wsdl.Attribute;
import modules.openair.wsdl.LoginResult;
import modules.openair.wsdl.MakeURLRequest;
import modules.openair.wsdl.MakeURLResult;
import modules.openair.wsdl.OAirServiceHandlerServiceLocator;
import modules.openair.wsdl.OaBase;
import modules.openair.wsdl.OaBooking;
import modules.openair.wsdl.OaBooking_request;
import modules.openair.wsdl.OaCustomField;
import modules.openair.wsdl.OaDate;
import modules.openair.wsdl.OaProject;
import modules.openair.wsdl.OaProjectassign;
import modules.openair.wsdl.OaProjectgroup;
import modules.openair.wsdl.OaUser;
import modules.openair.wsdl.ReadRequest;
import modules.openair.wsdl.ReadResult;
import generics.exceptions.CSCalendarEventOverlapsException;
import generics.helpers.CalendarSyncHelper;
import generics.objects.CSCalendar;
import generics.objects.CSConstants;
import generics.objects.CSEvent;
import sun.tools.tree.ThisExpression;
import testing.CalendarSyncProperties;

/**
 * This class should never be instantiated by itself. All instances of this class should be provided through
 * the OpenAirCalendarFactory class.
 * 
 * @author ttakahashi
 *
 */

public class OpenAirCalendar extends CSCalendar{

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	//Attributes required to make OpenAir API Calls
	private String username;
	private String password;
	private String company;
	private String apiNamespace;
	private String apiKey;
	private String clientName;
	private String clientVersion;

	//The properties file to load OpenAir credentials from
	private CalendarSyncProperties properties;


	//Creates the session object from openair from authentication
	private CSOASession csoaSession;

	//Creates the request object that will be sent as a batch request
	private ArrayList<ReadRequest> reads;

	private final Attribute LIMIT;

	/**
	 * Protected visibility so only the OpenAirCalendarFactory has access to this class.
	 * @param properties The CalendarSyncProperties object that contains all the properties to be laoded for this method.
	 */
	public OpenAirCalendar(CalendarSyncProperties properties)
	{
		LOGGER.info("Initializing OpenAirCalendar module...");
		this.reads = new ArrayList<ReadRequest>();
		this.properties = properties;
		collectCredentials();

		Attribute attr = new Attribute();
		attr.setName("limit");
		attr.setValue(String.format("%1$d", CSConstants.OPENAIR_RESPONSE_COUNT_LIMIT));
		this.LIMIT = attr;
		LOGGER.info("Initialized OpenAirCalendar module...");
	}

	/**
	 * No real need for this method, just isolating code that extracts data from actual initialization.
	 */
	private void collectCredentials()
	{
		LOGGER.info("Loading OpenAirCalendar configuration...");
		this.username = this.properties.getProperties().getProperty("username");
		this.password = this.properties.getProperties().getProperty("password");
		this.company = this.properties.getProperties().getProperty("company");
		this.apiNamespace = this.properties.getProperties().getProperty("apiNamespace");
		this.apiKey = this.properties.getProperties().getProperty("apiKey");
		this.clientName = this.properties.getProperties().getProperty("clientName");
		this.clientVersion = this.properties.getProperties().getProperty("clientVersion");
		LOGGER.info("OpenAirCalendar configuration loaded!");
	}

	/**
	 * Protected method so that only the OpenAirCalendarFactory can login a session.
	 */
	protected void login()
	{
		LOGGER.fine("Authenticating user...");
		//Attempt authentication
		CSOASession session = new CSOASession(CSConstants.OPENAIR_SANDBOX_ENDPOINT);
		LoginResult loginResult = null;
		try
		{
			session.login(this.username, this.password, this.company, this.apiNamespace, this.apiKey, this.clientName, this.clientVersion);
			this.csoaSession = session;
		} catch (RemoteException e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));

			LOGGER.severe("RemoteException occurred trying to login user: \n" + e.toString());
		} catch (ServiceException e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));

			LOGGER.severe("ServiceException occurred trying to login user: \n" + e.toString());
		} catch (SOAPException e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));

			LOGGER.severe("SOAPException occurred trying to login user: \n" + e.toString());
		}
	}

	/**
	 * Get all users stored in OpenAir for the provided userID. This should be a unique number and only return one result.
	 * @param userID The numeric ID representing a user.
	 */
	private void reqUserByUserID(String userID)
	{
		LOGGER.finer("Appending request for an OaUser object based on userID...");
		ReadRequest rr = new ReadRequest();
		rr.setType("User");
		rr.setMethod("equal to");
		OaUser user = new OaUser();
		user.setId(userID);
		rr.setObjects(new OaBase[]{user});
		rr.setAttributes(new Attribute[]{this.LIMIT});
		this.reads.add(rr);
	}

	/**
	 * Get all projects stored in OpenAir for the provided projectID.
	 * @param projectID The numeric projectID for a project - for example, "826"
	 */
	private void reqProjectByProjectID(String projectID)
	{
		LOGGER.finer("Appending request for an OaProject object based on projectID...");
		ReadRequest rr = new ReadRequest();
		rr.setType("Project");
		rr.setMethod("equal to");
		OaProject project = new OaProject();
		project.setId(projectID);
		rr.setObjects(new OaBase[]{project});
		rr.setAttributes(new Attribute[]{this.LIMIT});
		this.reads.add(rr);
	}

	/**
	 * Get all bookings stored in openair for the provided userID.
	 * @param userID The numeric userID for a user - for example, "78"
	 */
	private void reqBookingByUserID(String userID)
	{
		LOGGER.finer("Appending request for an OaBooking object based on userID...");
		ReadRequest rr = new ReadRequest();
		rr.setType("Booking");
		rr.setMethod("equal to");
		OaBooking br = new OaBooking();
		br.setUserid(userID);
		br.setApproval_status("A");
		rr.setObjects(new OaBase[]{br});
		rr.setAttributes(new Attribute[]{this.LIMIT});
		this.reads.add(rr);
	}

	/**
	 * Get all booking requests stored in openair for the provided userID.
	 * @param userID The numeric userID for a user - for example, "78".
	 */
	private void reqBookingRequestByUserID(String userID)
	{
		LOGGER.finer("Appending request for an OaBooking_request object based on userID");
		ReadRequest rr = new ReadRequest();
		rr.setType("Booking_request");
		rr.setMethod("equal to");
		OaBooking_request br = new OaBooking_request();
		br.setUser_id(userID);
		br.setApproval_status("A");
		rr.setObjects(new OaBase[]{br});
		rr.setAttributes(new Attribute[]{this.LIMIT});
		this.reads.add(rr);
	}

	private String generateProjectURL(String projectID) throws RemoteException
	{
		LOGGER.finer("Generating OaProject URL based on project ID...");
		String URL = null;
		MakeURLResult[] mkresults = null;

		MakeURLRequest make = new MakeURLRequest();
		make.setUid(this.csoaSession.getSessionID());
		make.setApp("pm");
		make.setPage("dashboard-project");
		OaProject project = new OaProject();
		project.setId(projectID);
		make.setArg(project);

		mkresults = this.csoaSession.getStub().makeURL(new MakeURLRequest[]{make});

		if(mkresults != null)
		{
			for(MakeURLResult result: mkresults)
			{
				return URL = result.getUrl();
			}
		}
		return URL;
	}
	
	private String generateBookingURL(String bookingID) throws RemoteException
	{
		LOGGER.finer("Generating OaBooking URL based on booking ID...");
		String URL = null;
		MakeURLResult[] mkresults = null;

		MakeURLRequest make = new MakeURLRequest();
		make.setUid(this.csoaSession.getSessionID());
		make.setApp("rm");
		make.setPage("default-url");

		mkresults = this.csoaSession.getStub().makeURL(new MakeURLRequest[]{make});

		if(mkresults != null)
		{
			for(MakeURLResult result: mkresults)
			{
				return URL = result.getUrl();
			}
		}
		return URL;
	}

	/**
	 * Submit the accumulated read requests. Upon successful submission, will reset the readRequestIndex so that the request array is reset.
	 * @return The results in a ReadResult array. The maximum size of the array is determined by the value of CSConstants.OPENAIR_RESPONSE_COUNT_LIMIT.
	 */
	public ReadResult[] submitReadRequest()
	{
		LOGGER.finer("Submitting read requests...");
		//Copy ReadRequests from arraylist into array. If there are more requests than the limit, break.
		ReadRequest[] requests = new ReadRequest[this.reads.size()];
		for(int i = 0; i < this.reads.size(); i++)
		{
			if(i > CSConstants.OPENAIR_REQUEST_COUNT_LIMIT) break;
			requests[i] = this.reads.get(i);
		}

		ReadResult [] results = null;
		try {
			results = this.csoaSession.getStub().read(requests);
			this.reads = new ArrayList<ReadRequest>();
			return results;
		} catch (RemoteException e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));

			LOGGER.severe("RemoteException occurred trying to login user: \n" + e.toString());
			return null;
		}
	}

	/**
	 * Parses an OaBooking and returns a CSEvent object if it fits within the search dates.
	 */
	private CSEvent parseOaBooking(OaBooking booking, Date searchStartDate, Date searchEndDate)
	{
		LOGGER.finer("Parsing OaBooking...");
		CSEvent event;
		OaBooking resBooking;
		Date startDate = null;
		Date endDate = null;
		Date creationDate = null;
		String description = "";
		String subject = null;

		resBooking = booking;
		event = new CSEvent();
		ReadResult[] results;
		ArrayList<CSEvent> params;
		String responseObjectType;
		String userName = null;
		String projectName = null;
		OaUser user;
		OaProject project = null;

		LOGGER.finest("Parsing start, end, and creation dates...");
		try {
			startDate = CSConstants.SIMPLE_DATE_FORMAT_OPENAIR.parse(resBooking.getStartdate());
			endDate = CSConstants.SIMPLE_DATE_FORMAT_OPENAIR.parse(resBooking.getEnddate());
			creationDate = CSConstants.SIMPLE_DATE_FORMAT_OPENAIR.parse(resBooking.getCreated());
		} catch (ParseException e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			LOGGER.severe("ParseException occurred parsing the start, end, and creation dates: \n" + e.toString());
		}

		LOGGER.finest("Event start date: " + resBooking.getStartdate());
		LOGGER.finest("Search start date: " + searchStartDate.toString());
		LOGGER.finest("Event end date: " + resBooking.getEnddate());
		LOGGER.finest("Search end date: " + searchEndDate.toString());

		if(!(endDate.before(searchStartDate) || startDate.after(searchEndDate)))
		{
			LOGGER.finest("Event occurs between start and end date, generating further requests...");
			//Increment by a second since OpenAir sets the time to 00:00:00 which in some calendars doesn't roll over to the next day.
			startDate.setSeconds(1);
			endDate.setSeconds(1);

			LOGGER.finest("Generating and submitting request...");
			reqUserByUserID(resBooking.getUserid());
			reqProjectByProjectID(resBooking.getProjectid());
			results = submitReadRequest();

			LOGGER.finest("Reading results of request...");
			if(results != null)
			{
				for(ReadResult result: results)
				{
					if(result.getObjects() != null)
					{
						OaBase[] retObjects = result.getObjects();
						for(OaBase object: retObjects)
						{
							responseObjectType = object.getClass().getName();
							if(responseObjectType.equals(OaUser.class.getName()))
							{
								user = (OaUser) object;
								userName = user.getAddr_first() + " " + user.getAddr_last();
							}
							if(responseObjectType.equals(OaProject.class.getName()))
							{
								project = (OaProject) object;
								projectName = project.getName();
							}
						}
					}
				}
			}

			LOGGER.finest("Generating CSEvent based on parsed results...");

			subject = userName +" " +
					resBooking.getPercentage() + "% - " +
					projectName + " - " +
					(endDate.getMonth()+1)+"/"+endDate.getDate()+"/"+(endDate.getYear()+1900);
			description += CalendarSyncHelper.generateDescription("Created", creationDate.toString());
			description += CalendarSyncHelper.generateDescription("Booking ID", resBooking.getId());

			String uniqueID = null;
			
			try {
				LOGGER.finest("Generating OpenAir URLs...");
				String projectURL = generateProjectURL(project.getId());
				String bookingURL = generateBookingURL(resBooking.getId());
				
				LOGGER.finest("Generating CSEvent object....");
				uniqueID = CalendarSyncHelper.generateUniqueID(CSConstants.OA_CONVERSION_TYPE, resBooking.getId());
				
				description += CalendarSyncHelper.generateDescription("Access Booking at", bookingURL);
				description += CalendarSyncHelper.generateDescription("Access Project at", projectURL);
				description += CalendarSyncHelper.generateDescription(CSConstants.UNIQUE_EVENT_ID, uniqueID);

				return new CSEvent(startDate, endDate, subject, description, uniqueID);
			} catch (RemoteException e) {
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				LOGGER.severe("RemoteException occurred trying to make booking URL: \n" + e.toString());
			}
		}
		LOGGER.finest("No event found within search dates, returning null...");
		return null;

	}

	/**
	 * Reads in the results from a submitReadRequest call.
	 * @param results The response from the submitReadRequest() call.
	 * @param searchStartDate The date to start looking for events from.
	 * @param searchEndDate The date to finish looking for events from.
	 * @return An array of all CSEvents that fit the search filter.
	 */
	private ArrayList<CSEvent> parseCalendarResults(ReadResult[] results, Date searchStartDate, Date searchEndDate)
	{
		LOGGER.finer("Parsing calendar results...");
		CSEvent event = null;
		String responseObjectType;
		ArrayList<CSEvent> events = new ArrayList<CSEvent>();

		/*
		 * Iterate through each result in the response array. Each result can contain multiple search results.
		 * Iterate through the results and parse the results and add to the event object.
		 */

		LOGGER.finest("Reading results of request...");
		for(ReadResult result: results)
		{
			if(result.getObjects() != null)
			{
				OaBase[] retObjects = result.getObjects();
				for(OaBase object: retObjects)
				{
					responseObjectType = object.getClass().getName();
					if(responseObjectType.equals(OaBooking.class.getName()))
					{
						event = parseOaBooking((OaBooking) object, searchStartDate, searchEndDate);
						if(event != null)
						{
							events.add(event);
						}
					}
				}
			}
		}
		LOGGER.finest("Finished reading results, returning events...");
		return events;
	}

	/**
	 * Gets all Bookings for a given userID between the specified dates contained in the requestParams map.
	 * @param requestParams A map of all the request attributes.
	 * @return An arrayList of CSEvent objects containing an even that fits the requestParam parameters
	 * @throws ParseException thrown if the provided date cannot be parsed.
	 */
	private ArrayList<CSEvent> getBookingsByUserID(Map<String, String> requestParams) throws ParseException
	{
		LOGGER.finer("Getting OaBookings based on user ID...");
		Date searchStartDate = CSConstants.SIMPLE_DATE_FORMAT_OPENAIR.parse(requestParams.get(CSConstants.REQUEST_PARAM_START_DATE));
		Date searchEndDate = CSConstants.SIMPLE_DATE_FORMAT_OPENAIR.parse(requestParams.get(CSConstants.REQUEST_PARAM_END_DATE));

		ReadResult[] results = null;

		String userID = requestParams.get(CSConstants.REQUEST_PARAM_OPENAIR_USERID);
		reqBookingByUserID(userID);
		results = submitReadRequest();

		return parseCalendarResults(results, searchStartDate, searchEndDate);
	}

	/**
	 * Obtains all events that occur between the provided dates
	 * @param requestParams The map object containing all parameters regarding the request.
	 * @return ArrayList<CSEvent> an arrayList of all events retrieved that match the description from requestParams.
	 */
	public ArrayList<CSEvent> getEvents(Map<String, String> requestParams) throws ParseException {
		LOGGER.finer("Getting all events based on request parameters...");

		String operationType = requestParams.get(CSConstants.REQUEST_PARAM_OPERATION_TYPE);

		if(operationType.equals(CSOAOPERATIONS.BOOKINGS_BY_UID.value()))
		{
			LOGGER.finest("Operation Type: " + CSOAOPERATIONS.BOOKINGS_BY_UID.value());
			return getBookingsByUserID(requestParams);
		}
		return null;
	}

	@Override
	public void setEvent(CSEvent event, Map<String, String> requestParams) {
		// TODO Auto-generated method stub
		//Not yet implemented
	}



}
