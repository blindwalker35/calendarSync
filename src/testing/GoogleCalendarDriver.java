package testing;

import generics.exceptions.GoogleCalendarDateFormatException;
import generics.objects.CSCalendar;
import generics.objects.CSConstants;
import generics.objects.CSEvent;
import generics.objects.CSMONTHS;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import modules.google.calendar.GoogleCalendar;

import com.google.api.services.calendar.model.Event;
import com.google.gson.JsonSyntaxException;

public class GoogleCalendarDriver{
	private CalendarSyncProperties properties;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


	public GoogleCalendarDriver(CalendarSyncProperties properties){this.properties = properties;}

	public void execute()
	{
		// The clientId and clientSecret can be found in Google Developers Console
		/*
		 * Once tests are complete on the google calendar component, remove these client ID and secret.
		 * Client ID and secret can be regenerated in Google Developer's Console.
		 */
		String clientID = this.properties.getProperties().getProperty(CSConstants.CSPROPERTY_CLIENTID).toString();
		String clientSecret = this.properties.getProperties().getProperty(CSConstants.CSPROPERTY_CLIENTSECRET).toString();

		System.out.println("Testing...");

		GoogleCalendar tc = null;
		try {
			//tc = new GoogleCalendar(clientID, clientSecret, "fv0s9pc0flso5l8c6i4o0i1sig@group.calendar.google.com");
			tc = new GoogleCalendar(this.properties);
			//			testGetCalendars(tc);
			//testSetEventForDayOnCalendar(tc);
			testAbstractMethodGetEvents(tc);
		} catch (GeneralSecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void testGetCalendars(GoogleCalendar tc)
	{
		//Dependent on getCalendars being public
		//System.out.println(tc.getCalendars().toString(0));
	}

	private void testSetEventForDayOnCalendar(GoogleCalendar tc)
	{

		Date startDate = new Date();
		startDate.setDate(2);
		startDate.setMonth(5);
		startDate.setYear(115);
		startDate.setHours(11);
		startDate.setMinutes(0);
		startDate.setSeconds(0);

		Date endDate = new Date();
		endDate.setDate(2);
		endDate.setMonth(5);
		endDate.setYear(115);
		endDate.setHours(12);
		endDate.setMinutes(0);
		endDate.setSeconds(0);

		CSEvent event = new CSEvent(startDate, endDate, "Test Event Set", "Test Event Set", "");

		//Dependent on setEventForDayOnCalendar being public
		//		try {
		//			tc.setEventForDayOnCalendar(event, "fv0s9pc0flso5l8c6i4o0i1sig@group.calendar.google.com");
		//		} catch (GoogleCalendarDateFormatException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		} catch (IOException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
	}


	/**
	 * Tests the implementation of the abstract method "getEvents".
	 * @param tc
	 */

	private void testAbstractMethodGetEvents(GoogleCalendar tc)
	{
		Map<String,String> requestParams = new HashMap<String, String>();
		requestParams.put(CSConstants.REQUEST_PARAM_START_DATE, "2015-06-02T00:00:00.000-0500");
		requestParams.put(CSConstants.REQUEST_PARAM_END_DATE, "2015-06-02T23:59:59.999-0500");
		Map<String, CSEvent> events = null;

		events = tc.getEvents(requestParams);

		for(CSEvent event: events.values())
		{
			System.out.println("Subject: " + event.getSubject());
			System.out.println("Description: " + event.getDescription());
			System.out.println("Start Date: " + event.getStartDate());
			System.out.println("End Date: " + event.getEndDate());
		}
	}
}
