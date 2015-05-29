package google.test;

import generics.exceptions.DateFormatException;
import generics.objects.CSMONTHS;
import google.calendar.GoogleCalendar;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.List;

import com.google.api.services.calendar.model.Event;
import com.google.gson.JsonSyntaxException;

public class GoogleCalendarDriver {
	public GoogleCalendarDriver() {}
	public void execute()
	{
	    // The clientId and clientSecret can be found in Google Developers Console
	    String clientID = "34140919076-59gmiqf8r021is6qg5n7tqe90fnp6jut.apps.googleusercontent.com";
	    String clientSecret = "YUllDP6hCjyq7VZ5bTcPqOTQ";
	    GoogleCalendar tc = null;
		try {
			tc = new GoogleCalendar(clientID, clientSecret);
			testGetEventsForDayOnCalendar(tc);
		} catch (GeneralSecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void testGetCalendar(GoogleCalendar tc)
	{
		System.out.println(tc.getCalendars().toString(0));
	}
	
	private static void testGetEventsForDay(GoogleCalendar tc)
	{
		try {
			tc.getEventsForDay(CSMONTHS.MAR, 31, 2015);
		} catch (DateFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void testGetEventsForDayOnCalendar(GoogleCalendar tc)
	{
	    List<Event> events = null;
		try {
			//Get calendar ID from the calendar settings in google calendar.
			events = tc.getEventsForDayOnCalendar(CSMONTHS.MAR, 31, 2015, "fv0s9pc0flso5l8c6i4o0i1sig@group.calendar.google.com");
			for(Event event: events)
			{
				System.out.println(event.getSummary());
				System.out.println(event.getStart().toString());
				System.out.println(event.getEnd().toString());

			}
		} catch (DateFormatException e) {
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
}
