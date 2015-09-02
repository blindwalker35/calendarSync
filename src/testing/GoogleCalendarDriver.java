package testing;

import generics.exceptions.GoogleCalendarDateFormatException;
import generics.objects.CSCalendar;
import generics.objects.CSConstants;
import generics.objects.CSEvent;
import generics.objects.CSMONTHS;
import google.calendar.GoogleCalendar;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.google.api.services.calendar.model.Event;
import com.google.gson.JsonSyntaxException;

public class GoogleCalendarDriver{
	private CalendarSyncProperties properties;
	
	public GoogleCalendarDriver(CalendarSyncProperties properties){this.properties = properties;}
	
	public void execute()
	{
		// The clientId and clientSecret can be found in Google Developers Console
		/*
		 * Once tests are complete on the google calendar component, remove these client ID and secret.
		 * Client ID and secret can be regenerated in Google Developer's Console.
		 */
		String clientID = this.properties.getProperties().getProperty("clientID").toString();
		String clientSecret = this.properties.getProperties().getProperty("clientSecret").toString();
		
		System.out.println("Testing...");
		
		GoogleCalendar tc = null;
		try {

			tc = new GoogleCalendar(clientID, clientSecret, "fv0s9pc0flso5l8c6i4o0i1sig@group.calendar.google.com");
			//testGetCalendars(tc);
			//testGetEventsForDayOnCalendar(tc);
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
		System.out.println(tc.getCalendars().toString(0));
	}
	
	private void testGetEventsForDayOnCalendar(GoogleCalendar tc)
	{
		List<CSEvent> events = null;
		try {
			//Get calendar ID from the calendar settings in google calendar.
			events = tc.getEventsForDayOnCalendar(CSMONTHS.JUN, 2, 2015);
			for(CSEvent event: events)
			{
				System.out.println(event.getSubject());
				System.out.println(event.getStartDate().toString());
				System.out.println(event.getEndDate().toString());
				Date date = event.getStartDate();
				System.out.println("Date: " + date.getDate());
				System.out.println("Month: " + date.getMonth());
				System.out.println("Year: " + date.getYear());
				System.out.println("Hour: " + date.getHours());
				System.out.println("Minute: " + date.getMinutes());
				System.out.println("Second: " + date.getSeconds());
			}
		} catch (GoogleCalendarDateFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			//exception thrown from simple date format when comparing dates
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		
		CSEvent event = new CSEvent(startDate, endDate, "Test Event Set", "Test Event Set");
		
		try {
			tc.setEventForDayOnCalendar(event, "fv0s9pc0flso5l8c6i4o0i1sig@group.calendar.google.com");
		} catch (GoogleCalendarDateFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		ArrayList<CSEvent> events = null;
		try {
			events = tc.getEvents(requestParams);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(CSEvent event: events)
		{
			System.out.println("Subject: " + event.getSubject());
			System.out.println("Description: " + event.getDescription());
			System.out.println("Start Date: " + event.getStartDate());
			System.out.println("End Date: " + event.getEndDate());
		}
	}
}
