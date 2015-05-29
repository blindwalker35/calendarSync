package google.calendar;

import generics.exceptions.DateFormatException;
import generics.objects.CSMONTHS;
import google.gson.CalendarListEntryJSON;
import google.gson.CalendarListJSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.Calendar.Calendars;
import com.google.api.services.calendar.Calendar.Calendars.Get;
import com.google.api.services.calendar.model.*;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/* Organization of this object looks like the folowing:
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

public class GoogleCalendar{

	private final String APPLICATION_NAME = "TEST_APPLICATION";
	private Calendar calendar;
	private final int MIN_YEAR = 2010;
	private final int MAX_YEAR = 2020;
	private final int YEAR_SUBTRACTION_CONSTANT = 1900;

	public GoogleCalendar(String clientID, String clientSecret) throws GeneralSecurityException, IOException
	{
		setup(clientID, clientSecret);
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
		HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
		JacksonFactory jsonFactory = JacksonFactory.getDefaultInstance();

		// Or your redirect URL for web based applications.
		String redirectUrl = "urn:ietf:wg:oauth:2.0:oob";
		String scope = "https://www.googleapis.com/auth/calendar";

		GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow(
				httpTransport, jsonFactory, clientID, clientSecret, Collections.singleton(scope));
		// Step 1: Authorize
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

		Credential credential = new GoogleCredential.Builder()
		.setTransport(httpTransport)
		.setJsonFactory(jsonFactory)
		.setClientSecrets(clientID, clientSecret)
		.build().setFromTokenResponse(response);

		this.calendar = new Calendar.Builder(httpTransport, jsonFactory, credential).setApplicationName(this.APPLICATION_NAME).build();

		System.out.println("Done authentication and authorization...");
	}
	
	/**
	 * Gets all calendars for the user specified during setup
	 * 
	 * @return The Java object containing calendar information
	 */
	public CalendarListJSON getCalendars()
	{
		try {
			CalendarList calendars = this.calendar.calendarList().list().execute();

			Gson gson = new Gson();
			return gson.fromJson(calendars.toString(), CalendarListJSON.class);

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/** 
	 * Gets all events for a given day of the year that are on the account's calendar.
	 * 
	 * @param month	The month of the year to look for events.
	 * @param day	The day of the month to look for events.
	 * @param year	The year to look for events.
	 * @return The list of events for the specified date.
	 * */
	public List<Event> getEventsForDay(CSMONTHS month, int day, int year) throws DateFormatException, IOException
	{
		if(!isValidDay(month, day, year))
		{
			throw new DateFormatException("Invalid month, day, or year provided...");
		}
		//TO BE COMPLETED

		return null;
	}

	/**
	 * Gets all events listed on a calendar for a given day of the year.
	 * 
	 * @param month	The month of the year to look for events.
	 * @param day	The day of the month to look for events.
	 * @param year	The year to look for events.
	 * @param calendarName	The name of the calendar to look at events for.
	 *  The value for this is found in the Calendar Details by navigating in Google Calendar from
	 *  Calendar Settings--> Calendar Address --> Calendar ID.
	 * @return A list of all events occurring on the provided date and calendar.
	 * @throws DateFormatException Thrown if invalid dates are provided.
	 * @throws JsonSyntaxException Thrown if the JSON cannot be parsed into the provided class.
	 * @throws IOException 	Thrown if various HTTP requests cannot be completed.
	 * @throws ParseException	Thrown if the provided dates cannot be parsed into the expected date format.
	 */
	@SuppressWarnings("deprecation")
	public List<Event> getEventsForDayOnCalendar(CSMONTHS month, int day, int year, String calendarName) throws DateFormatException, JsonSyntaxException, IOException, ParseException
	{
		//Check to make sure the provided values are valid
		if(!isValidDay(month, day, year))
		{
			throw new DateFormatException("Invalid month, day, or year provided...");
		}

		Gson gson = new Gson();
		CalendarListEntryJSON calendarListEntry = gson.fromJson(this.calendar.calendarList().get(calendarName).execute().toPrettyString(), CalendarListEntryJSON.class);

		String pageToken = null;
		Events events = null;

		events = this.calendar.events().list(calendarListEntry.getID()).setPageToken(pageToken).execute();

		//Year is based on 1900, Month is 0 indexed. Have to use deprecated Date due to Google's constructors for DateTime object
		Date startDate = new Date(year-this.YEAR_SUBTRACTION_CONSTANT, month.getMonth()-1, day);

		//Create end date based on provided values
		Date endDate = datePlusOne(month, day, year);

		/* Iterate through all events on calendar to verify if event occurs between given dates
		 * */
		List<Event> retEvents = new ArrayList<Event>();
		for(Event event: events.getItems())
		{
			if(isEventBetweenDates(startDate, endDate, event))
			{
				retEvents.add(event);
			}
		}
		return retEvents;

	}

	/**
	 * Check if the provided event occurs between the provided start and end dates
	 * 
	 * @param startDate The start date to compare against. If the provided event starts before this date, method will return false.
	 * @param endDate The end date to compare against. If the provided event ends after this date, method will return false.
	 * @param event The event to evaluate. The event must have at least a start date. If no end date exists, then method will return false.
	 * @return Returns the evaluation whether the provided event starts after the provided start date.
	 * @throws ParseException
	 */
	private boolean isEventBetweenDates(Date startDate, Date endDate, Event event) throws ParseException
	{
		EventDateTime eventStart = null, eventEnd = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		
		
		Date eventStartDate = null, eventEndDate = null;
		String strStartDate, strEndDate;
		eventStart = event.getStart();
		eventEnd = event.getEnd();

		if(eventStart != null)
		{
			strStartDate = eventStart.getDateTime().toString();
			strStartDate = strStartDate.replaceAll(":(\\d\\d)$", "$1");
			eventStartDate = sdf.parse(strStartDate);
			//check if event starts after the provided date
			if(eventStartDate.after(startDate))
			{
				if(eventEnd != null)
				{
					strEndDate = eventEnd.getDateTime().toString();
					strEndDate = strEndDate.replaceAll(":(\\d\\d)$", "$1");
					eventEndDate = sdf.parse(strEndDate);
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
	 * Validate whether a given month, day, and year combination is valid. This also accounts for leap years.
	 * 
	 * @param month	The month to validate.
	 * @param day	The day to validate.
	 * @param year	The year to validate.
	 * @return	Returns a boolean value whether the provided month, day, and year is a valid date.
	 */
	private boolean isValidDay(CSMONTHS month, int day, int year)
	{
		if(year < this.MIN_YEAR || year > this.MAX_YEAR){return false;}
		if(day < 1){return false;}

		if(month == CSMONTHS.JAN)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.FEB)
		{
			int feb_max = 28;
			if((year%4)==0)
			{
				feb_max=29;
			}
			if(day > feb_max)
			{
				return false;
			}
		}else if(month == CSMONTHS.MAR)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.APR)
		{
			if(day > 30)
			{
				return false;
			}
		}else if(month == CSMONTHS.MAY)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.JUN)
		{
			if(day > 30)
			{
				return false;
			}
		}else if(month == CSMONTHS.JUL)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.AUG)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.SEP)
		{
			if(day > 30)
			{
				return false;
			}
		}else if(month == CSMONTHS.OCT)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.NOV)
		{
			if(day > 30)
			{
				return false;
			}
		}else if(month == CSMONTHS.DEC)
		{
			if(day > 31)
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * There isn't a particularly good built in way to increment a date in an object class - would have to use
	 * Java Calendar object - but due to Google package imports, would have to provide full package name to use
	 * the Java Calendar instead of Google Calendar. Out of preference, creating this unnecessary package. Could
	 * and should remove this method though.
	 * 
	 * Notes:
	 * -Years in the date object are based on 1900, so will have to sutract 1900 from all years 
	 * -Months in a date object are 0-indexed, so must subtract when using enum
	 * -Currently does NOT account for any changes in time for time zones, such as daylight savings.
	 * 
	 * @param month	The month to increment a day to.
	 * @param day	The day to increment a day to.
	 * @param year	The year to increment a day to.
	 * @return	The new Date after incrementing by one day.
	 */
	@SuppressWarnings("deprecation")
	private Date datePlusOne(CSMONTHS month, int day, int year)
	{
		if(isValidDay(month, day+1, year))
		{
			return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, month.getMonth()-1, day+1);
			/*Only reason to fail date validity is if the month or year rolled over
			 * IsValidDay also accounts for leap years, so only rollovers are in the else
			 */
		}else
		{
			if(month == CSMONTHS.JAN)
			{
				return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.FEB.getMonth()-1, 1);
			}else if(month == CSMONTHS.FEB)
			{
				return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.MAR.getMonth()-1, 1);
			}else if(month == CSMONTHS.MAR)
			{
				return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.APR.getMonth()-1, 1);
			}else if(month == CSMONTHS.APR)
			{
				return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.MAY.getMonth()-1, 1);
			}else if(month == CSMONTHS.MAY)
			{
				return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.JUN.getMonth()-1, 1);
			}else if(month == CSMONTHS.JUN)
			{
				return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.JUL.getMonth()-1, 1);
			}else if(month == CSMONTHS.JUL)
			{
				return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.AUG.getMonth()-1, 1);
			}else if(month == CSMONTHS.AUG)
			{
				return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.SEP.getMonth()-1, 1);
			}else if(month == CSMONTHS.SEP)
			{
				return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.OCT.getMonth()-1, 1);
			}else if(month == CSMONTHS.OCT)
			{
				return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.NOV.getMonth()-1, 1);
			}else if(month == CSMONTHS.NOV)
			{
				return new Date(year-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.DEC.getMonth()-1, 1);
			}else if(month == CSMONTHS.DEC)
			{
				return new Date(year+1-this.YEAR_SUBTRACTION_CONSTANT, CSMONTHS.JAN.getMonth()-1, 1);
			}else
			{
				return null;
			}
		}
	}
	
	/**
	 * Getter for calendar object.
	 * 
	 * @return The calendar object.
	 */
	public Calendar getCalendar(){return this.calendar;}

}
