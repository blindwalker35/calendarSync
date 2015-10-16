package modules.google.calendar;

import generics.exceptions.GoogleCalendarDateFormatException;
import generics.helpers.CalendarSyncHelper;
import generics.objects.CSCalendar;
import generics.objects.CSConstants;
import generics.objects.CSEvent;
import generics.objects.CSMONTHS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import modules.google.gson.CalendarListEntryJSON;
import modules.google.gson.CalendarListJSON;
import testing.CalendarSyncProperties;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.model.*;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/* Organization of this object looks like the following:
 * 
 * ToshieCalendar
 * 	|_CalendarListJSON
 * 		|_CalendarListEntryJSON
 * 			|_ReminderJSON
 * 			|_NotificationSettingsJSON
 * 				|_NotificationJSON
 * 
 * */

/* Basic Google Calendar concepts
 * ==============================================================================================================================
 * Event
 *	A single event on a calendar containing information such as the title of event, start and end times, and attendees.
 *Calendar
 *	A set of metadata, such as a description, for a single calendar.
 *Calendar List
 *	A list of all calendars on a user's calendar list in the Calendar UI.
 *Setting
 *	A user preference from the Calendar UI, such as the user's time zone.
 *ACL
 *	A single access control rule containing information such as the type and scope of the rule.
 *Color
 *	A list of colors presented in the Calendar UI, in two groups: for events and calendars.
 *Free/busy
 *	A set of times, for a set of calendars, where the calendar does not have any events.
 * ==============================================================================================================================
 * A resource is an individual data entity with a unique identifier. The Google Calendar API operates on five types of resources:
 * 
 *Event Resource
 *	Represents a single event on a calendar.
 *Calendars Resource
 *	Represents metadata for an individual calendar.
 *CalendarList Resource
 *	Represents metadata for an individual calendar that appears on the user's calendar list in the UI.
 *Settings Resource
 *	Represents a single user preference from the Calendar UI.
 *ACL Resource
 *	Represents an ACL.
 *Color Resource
 *	Represents the list of colors from the Calendar UI.
 *Free/busy Resource
 *	Represents free/busy times for a set of calendars.
 *==============================================================================================================================
 *The Google Calendar API data model is based on groups of resources, called collections:
 *
 *Events Collection
 *	Consists of all the Event Resources within a specific Calendar Resource.
 *Calendars Collection
 *	Consists of all the Calendar Resources for a specific user.
 *CalendarList Collection
 *	Consists of all the CalendarList Resources for a specific user.
 *Settings Collection
 *	Consists of all the Settings Resources for a specific user.
 *ACL Collection
 *	Consists of all the ACL Resources applied to a specific calendar.
 * */

public class GoogleCalendar extends CSCalendar{

	private final String APPLICATION_NAME = "TEST_APPLICATION";
	private Calendar calendar;
	private final String CALENDAR_NAME;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	
	public GoogleCalendar(CalendarSyncProperties csp) throws GeneralSecurityException, IOException
	{		
		LOGGER.info("Initializing GoogleCalendar module...");
		String clientID = csp.getProperties().getProperty(CSConstants.CSPROPERTY_CLIENTID);
		String clientSecret = csp.getProperties().getProperty(CSConstants.CSPROPERTY_CLIENTSECRET);
		this.CALENDAR_NAME = csp.getProperties().getProperty(CSConstants.CSPROPERTY_CALENDARNAME);
		setup(clientID, clientSecret);
		LOGGER.info("Initialized GoogleCalendar module...");
		
	}

	/**
	 * Setup the Google Calendar credentials to connect and retrieve data.
	 * 
	 * @param clientID		The Client ID is obtained from the Google Developer's Console
	 * @param clientSecret 	The Client Secret is obtained from the Google Developer's Console
	 * @throws GeneralSecurityException	Thrown if there is an error generating an HTTP request to Google.
	 * @throws IOException	Thrown if there are any errors getting a response from Google.
	 */

	private void setup(String clientID, String clientSecret) throws GeneralSecurityException, IOException
	{
		
		LOGGER.finer("Setting up authentication and authorization...");
		HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
		JacksonFactory jsonFactory = JacksonFactory.getDefaultInstance();

		// Or your redirect URL for web based applications.
		String redirectUrl = "urn:ietf:wg:oauth:2.0:oob";
		String scope = "https://www.googleapis.com/auth/calendar";

		LOGGER.finest("Collecting credentials...");
		GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow(
				httpTransport, jsonFactory, clientID, clientSecret, Collections.singleton(scope));
		// Step 1: Authorize
		LOGGER.finest("Requesting authorization...");
		String authorizationUrl = flow.newAuthorizationUrl().setRedirectUri(redirectUrl).build();

		
		// Point or redirect your user to the authorizationUrl.
		System.out.println("Go to the following link in your browser:");
		System.out.println(authorizationUrl);

		// Read the authorization code from the standard input stream.
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is the authorization code?");
		String code = in.readLine();
		// End of Step 1

		// Step 2: Exchange
		GoogleTokenResponse response = flow.newTokenRequest(code).setRedirectUri(redirectUrl).execute();
		// End of Step 2
		LOGGER.finest("Authorized user...");
		
		Credential credential = new GoogleCredential.Builder()
		.setTransport(httpTransport)
		.setJsonFactory(jsonFactory)
		.setClientSecrets(clientID, clientSecret)
		.build().setFromTokenResponse(response);

		this.calendar = new Calendar.Builder(httpTransport, jsonFactory, credential).setApplicationName(this.APPLICATION_NAME).build();
		LOGGER.finer("Finished authentication and authorization...");
		
		System.out.println("Done authentication and authorization...");
		
	}

	/**
	 * Getter for calendar object.
	 * 
	 * @return The calendar object.
	 */
	public Calendar getCalendar()
	{
		LOGGER.finer("Retrieving calendar...");
		return this.calendar;
	}

	/**
	 * Gets all calendars for the user specified during setup
	 * 
	 * @return The Java object containing calendar information
	 */
	public CalendarListJSON getCalendars()
	{
		LOGGER.finer("Retrieving calendars...");
		try {
			CalendarList calendars = this.calendar.calendarList().list().execute();
			Gson gson = new Gson();
			LOGGER.finest("Converting JSON object to Java CalendarListJSON object...");
			return gson.fromJson(calendars.toString(), CalendarListJSON.class);

		} catch (IOException e) 
		{
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			
			LOGGER.severe("IOException occurred trying to get all calendars: \n" + e.toString());
			return null;
		}
		
	}

	/**
	 * Gets all events listed on a calendar for a given day of the year.
	 * 
	 * @param searchStartDate The first date to include when looking for events.
	 * @param searchEndDate The last date to include when looking for events.
	 * @return A list of all events occurring on the provided date and calendar.
	 * @throws DateFormatException Thrown if invalid dates are provided.
	 * @throws JsonSyntaxException Thrown if the JSON cannot be parsed into the provided class.
	 * @throws IOException 	Thrown if various HTTP requests cannot be completed.
	 * @throws ParseException	Thrown if the provided dates cannot be parsed into the expected date format.
	 */
	
	public List<CSEvent> getEventsForRangeOfDatesOnCalendar(Date searchStartDate, Date searchEndDate) throws JsonSyntaxException, IOException, ParseException
	{
		LOGGER.finer("Getting events for range of dates on a calendar...");
		
		LOGGER.finest("Getting list of events from calendar...");
		Gson gson = new Gson();
		CalendarListEntryJSON calendarListEntry = gson.fromJson(this.calendar.calendarList().get(this.CALENDAR_NAME).execute().toPrettyString(), CalendarListEntryJSON.class);

		String pageToken = null;
		Events events = null;

		events = this.calendar.events().list(calendarListEntry.getID()).setPageToken(pageToken).execute();

		/* Iterate through all events on calendar to verify if event occurs between given dates
		 * */
		LOGGER.finest("Applying search filter on events...");
		List<CSEvent> retEvents = new ArrayList<CSEvent>();
		for(Event event: events.getItems())
		{
			if(isEventBetweenDates(searchStartDate, searchEndDate, event))
			{
				retEvents.add(convertEventToCSEvent(event));
			}
		}
		
		return retEvents;
	}

	/**
	 * Create an event on the provided calendar on the specified date.
	 * @param event	The contents of the event to create.
	 * @param calendarID	The name of the calendar to create the event on.
	 * @throws DateFormatException Thrown if the provided dates cannot be parsed into the expected date format.
	 * @throws IOException Thrown if there is an error pushing the event to the calendar.
	 */

	@SuppressWarnings("deprecation")
	public void setEventForDayOnCalendar(CSEvent event, String calendarID) throws GoogleCalendarDateFormatException, IOException
	{
		LOGGER.finer("Setting event for specified day on specified calendar...");
		int litMonth, day, year;
		
		Date date = event.getStartDate();
		litMonth = date.getMonth();
		CSMONTHS temp = CSMONTHS.JAN;	//don't ask...
		CSMONTHS month = temp.getMonthWithValue(litMonth);
		day = date.getDate();
		year = date.getYear()+CSConstants.YEAR_CONSTANT;
		
		//Check to make sure the provided values are valid
		if(!CalendarSyncHelper.isValidDay(month, day, year))
		{
			throw new GoogleCalendarDateFormatException("Invalid month, day, or year provided...");
		}

		LOGGER.finer("Converting specified CSEvent object to an Event object...");
		Event converted = convertCSEventToEvent(event);
		Event createdEvent = this.calendar.events().insert(calendarID, converted).execute();
		
		//Don't have to do anything with createdEvent but in case any post operations are to be performed...
	}

	/**
	 * Check if the provided event occurs between the provided start and end dates
	 * 
	 * @param startDate The start date to compare against. If the provided event starts before this date, method will return false.
	 * @param endDate The end date to compare against. If the provided event ends after this date, method will return false.
	 * @param event The event to evaluate. The event must have at least a start date. If no end date exists, then method will return false.
	 * @return Returns the evaluation whether the provided event starts after the provided start date.
	 * @throws ParseException Thrown if the provided dates cannot be parsed into the expected date format.
	 */
	private boolean isEventBetweenDates(Date startDate, Date endDate, Event event) throws ParseException
	{
		LOGGER.finer("Checking if event is between specified dates...");
		EventDateTime eventStart = null, eventEnd = null;

		Date eventStartDate = null, eventEndDate = null;
		String strStartDate, strEndDate;
		eventStart = event.getStart();
		eventEnd = event.getEnd();

		if(eventStart != null)
		{
			strStartDate = eventStart.getDateTime().toString();
			strStartDate = strStartDate.replaceAll(":(\\d\\d)$", "$1");
			eventStartDate = CSConstants.SIMPLE_DATE_FORMAT_GOOGLE.parse(strStartDate);
			//check if event starts after the provided date
			if(eventStartDate.after(startDate))
			{
				if(eventEnd != null)
				{
					strEndDate = eventEnd.getDateTime().toString();
					strEndDate = strEndDate.replaceAll(":(\\d\\d)$", "$1");
					eventEndDate = CSConstants.SIMPLE_DATE_FORMAT_GOOGLE.parse(strEndDate);
					if(eventEndDate.before(endDate))
					{
						return true;
					}else
					{
						return false;
					}
				}else
				{
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Converts a CSEvent object (the intermediate event data format) to an Event object (google calendar event data format).
	 * The mapping of attributes are as follows (from Event --> CSEvent)
	 * <p/>
	 * <p/>Start --> StartDate
	 * <p/>End --> EndDate
	 * <p/>Description --> Description
	 * <p/>Summary --> Subject
	 * 
	 * @param event The Event object to convert.
	 * @return	The converted CSEvent object.
	 * @throws ParseException Thrown if the provided dates cannot be parsed into the expected date format.
	 */
	private CSEvent convertEventToCSEvent(Event event) throws ParseException
	{
		LOGGER.finer("Converting Event object to CSEvent object...");
		Date eventStartDate = null, eventEndDate = null;

		if(event.getStart() != null)
		{
			eventStartDate = CSConstants.SIMPLE_DATE_FORMAT_GOOGLE.parse(event.getStart().getDateTime().toString().replaceAll(":(\\d\\d)$", "$1"));
		}

		if(event.getEnd() != null)
		{
			eventEndDate = CSConstants.SIMPLE_DATE_FORMAT_GOOGLE.parse(event.getEnd().getDateTime().toString().replaceAll(":(\\d\\d)$", "$1"));
		}

		return new CSEvent(eventStartDate, eventEndDate, event.getSummary(), event.getDescription(), "");
	}

	/**
	 * Converts a CSEvent object (the intermediate event data format) to an Event object (google calendar event data format).
	 * The mapping of attributes are as follows (from CSEvent --> Event)
	 * <p/>
	 * <p/>StartDate --> Start
	 * <p/>EndDate --> End
	 * <p/>Description --> Description
	 * <p/>Subject --> Summary
	 * 
	 * @param csevent	The CSEvent object to convert.
	 * @return	The converted Event object.
	 */
	private Event convertCSEventToEvent(CSEvent csevent)
	{
		LOGGER.finer("Converting CSEvent object to Event object...");
		Event event = new Event();		

		DateTime startDateTime = new DateTime(csevent.getStartDate());
		EventDateTime eventStart = new EventDateTime();
		eventStart.setDateTime(startDateTime);
		event.setStart(eventStart);
		
		DateTime endDateTime = new DateTime(csevent.getEndDate());
		EventDateTime eventEnd = new EventDateTime();
		eventEnd.setDateTime(endDateTime);
		event.setEnd(eventEnd);
		
		event.setDescription(csevent.getDescription());
		event.setSummary(csevent.getSubject());
		
		return event;
	}

	/**
	 * Implementation of abstract method from parent class - CSCalendar.
	 */
	public ArrayList<CSEvent> getEvents(Map<String, String> requestParams) throws ParseException 
	{
		LOGGER.finer("Getting events based on request parameters...");
		
		ArrayList<CSEvent> events = new ArrayList<CSEvent>();
		Date eventStartDate = CSConstants.SIMPLE_DATE_FORMAT_GOOGLE.parse(requestParams.get(CSConstants.REQUEST_PARAM_START_DATE));
		Date eventEndDate = CSConstants.SIMPLE_DATE_FORMAT_GOOGLE.parse(requestParams.get(CSConstants.REQUEST_PARAM_END_DATE));
		
		/**
		 * This loop iterates through the dates in the range provided using the datePlusOne method.
		 * Because I'm an idiot, you have to instantiate a CSMONTHS object to "generate" a new month so a singleton is used.
		 */
		for(Date currDate = eventStartDate; currDate.before(eventEndDate); currDate = 
				CalendarSyncHelper.datePlusOne(CSConstants.CSMONTHS_SNGL.getMonthWithValue(currDate.getMonth()+1), currDate.getDate(), currDate.getYear()+CSConstants.YEAR_CONSTANT))
		{
			try {
				for(CSEvent dayEvent: getEventsForRangeOfDatesOnCalendar(eventStartDate, eventEndDate))
				{
					events.add(dayEvent);
				}
			} catch (JsonSyntaxException e) {
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				LOGGER.severe("JsonSyntaxException occurred trying to get all events from calendar: \n" + e.toString());
			} catch (IOException e) {
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				LOGGER.severe("IOException occurred trying to get all events from calendar: \n" + e.toString());
			}
		}
			
		return events;
	}

	/**
	 * Implementation of abstract method from parent class - CSCalendar.
	 */
	public void setEvent(CSEvent event, Map<String, String> requestParams){
		LOGGER.finer("Setting event based on request parameters...");
		try {
			setEventForDayOnCalendar(event, requestParams.get(CSConstants.REQUEST_PARAM_GOOGLE_CALENDAR_ID));
		} catch (GoogleCalendarDateFormatException e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			LOGGER.severe("GoogleCalendarDateFormatException occurred trying to get all events from calendar: \n" + e.toString());
		} catch (IOException e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			LOGGER.severe("IOException occurred trying to get all events from calendar: \n" + e.toString());
		}
	}
}
