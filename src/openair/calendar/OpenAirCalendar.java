package openair.calendar;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import generics.exceptions.CSCalendarEventOverlapsException;
import generics.objects.CSCalendar;
import generics.objects.CSConstants;
import generics.objects.CSEvent;
import openair.objects.CSOABooking;
import openair.objects.CSOASession;
import openair.wsdl.Attribute;
import openair.wsdl.LoginResult;
import openair.wsdl.OAirServiceHandlerServiceLocator;
import openair.wsdl.OaBase;
import openair.wsdl.OaBooking_request;
import openair.wsdl.ReadRequest;
import openair.wsdl.ReadResult;
import testing.CalendarSyncProperties;

/**
 * This class should never be instantiated by itself. All instances of this class should be provided through
 * the OpenAirCalendarFactory class.
 * 
 * @author ttakahashi
 *
 */

public class OpenAirCalendar extends CSCalendar{
	
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
	private ReadRequest [] reads;
	private int readRequestIndex;
	
	/**
	 * Protected visibility so only the OpenAirCalendarFactory has access to this class.
	 * @param properties The CalendarSyncProperties object that contains all the properties to be laoded for this method.
	 */
	protected OpenAirCalendar(CalendarSyncProperties properties)
	{
		reads = new ReadRequest[CSConstants.OPENAIR_REQUEST_COUNT_LIMIT];
		readRequestIndex = 0;
		this.properties = properties;
		collectCredentials();
	}
	
	/**
	 * No real need for this method, just isolating code that extracts data from actual initialization.
	 */
	private void collectCredentials()
	{
		
		this.username = this.properties.getProperties().getProperty("username");
		this.password = this.properties.getProperties().getProperty("password");
		this.company = this.properties.getProperties().getProperty("company");
		this.apiNamespace = this.properties.getProperties().getProperty("apiNamespace");
		this.apiKey = this.properties.getProperties().getProperty("apiKey");
		this.clientName = this.properties.getProperties().getProperty("clientName");
		this.clientVersion = this.properties.getProperties().getProperty("clientVersion");
		
	}
	
	/**
	 * Protected method so that only the OpenAirCalendarFactory can login a session.
	 */
	protected void login()
	{
		//Attempt authentication
		CSOASession session = new CSOASession(CSConstants.OPENAIR_SANDBOX_ENDPOINT);
		LoginResult loginResult = null;
		try
		{
			session.login(this.username, this.password, this.company, this.apiNamespace, this.apiKey, this.clientName, this.clientVersion);
			this.csoaSession = session;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Should remove this method as soon as all OpenAir operations are moved into this class
	 * @return
	 */
	public CSOASession getSession(){return this.csoaSession;}
	
	public List<CSEvent> getBookingRequest(String bookingID)
	{
		CSOABooking csoaBooking = new CSOABooking(this.csoaSession);
		ReadRequest rr = new ReadRequest();
		rr.setType("Booking_request");
		rr.setMethod("equal to");
		reads[this.readRequestIndex] = rr;
		reads[this.readRequestIndex].setObjects(new OaBase[]{csoaBooking.retrieveBookingWithID(bookingID)});
		this.readRequestIndex++;
		return null;
	}
	
	/**
	 * Submit the accumulated read requests. Upon successful submission, will reset the readRequestIndex so that the request array is reset.
	 * @return
	 */
	public ReadResult[] submitReadRequest()
	{
		Attribute attr = new Attribute();
		attr.setName("limit");
		attr.setValue(String.format("%1$d", CSConstants.OPENAIR_RESPONSE_COUNT_LIMIT));
		reads[0].setAttributes(new Attribute[]{attr});

		ReadResult [] results = null;
		try {
			results = this.csoaSession.getStub().read(reads);
			this.reads = new ReadRequest[CSConstants.OPENAIR_REQUEST_COUNT_LIMIT];
			this.readRequestIndex = 0;
			return results;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public ArrayList<CSEvent> getEvents(Map<String, String> requestParams) {
		String operationType = requestParams.get(CSConstants.REQUEST_PARAM_OPERATION_TYPE);
		return null;
	}

	@Override
	public void setEvent(CSEvent event, Map<String, String> requestParams) {
		// TODO Auto-generated method stub
		
	}
	
}
