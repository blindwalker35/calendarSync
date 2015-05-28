package drivers;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.List;
import com.google.api.services.calendar.model.Event;
import com.google.gson.JsonSyntaxException;
import calendars.ToshieCalendar;
import calendars.ToshieCalendar.MONTHS;
import exceptions.DateFormatException;

public class Driver {
	public static void main(String[] args)
	{	
		
	    // The clientId and clientSecret can be found in Google Developers Console
	    String clientID = "34140919076-59gmiqf8r021is6qg5n7tqe90fnp6jut.apps.googleusercontent.com";
	    String clientSecret = "YUllDP6hCjyq7VZ5bTcPqOTQ";
	    ToshieCalendar tc = null;
		try {
			tc = new ToshieCalendar(clientID, clientSecret);

			//testGetCalendar(tc);
			//testGetEventsForDay(tc);
			testGetEventsForDayOnCalendar(tc);
		} catch (GeneralSecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void testGetCalendar(ToshieCalendar tc)
	{
		System.out.println(tc.getCalendars().toString(0));
	}
	
	private static void testGetEventsForDay(ToshieCalendar tc)
	{
		try {
			tc.getEventsForDay(MONTHS.MAR, 31, 2015);
		} catch (DateFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void testGetEventsForDayOnCalendar(ToshieCalendar tc)
	{
	    List<Event> events = null;
		try {
			events = tc.getEventsForDayOnCalendar(MONTHS.MAR, 31, 2015, "fv0s9pc0flso5l8c6i4o0i1sig@group.calendar.google.com");
			for(Event event: events)
			{
				System.out.println(event.getSummary());
				System.out.println(event.getStart().toString());
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
