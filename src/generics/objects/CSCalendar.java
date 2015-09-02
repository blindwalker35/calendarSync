package generics.objects;

import generics.exceptions.CSCalendarEventOverlapsException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class CSCalendar{
	ArrayList<CSEvent> events;
	/**
	 * Get all events that occur between the given START_DATE and END_DATE parameters.
	 * 
	 * @param requestParams Map that contains the request parameters necessary for the class to create a request. These parameters are unique to each
	 * 	application, so will be up to each implementation of the Calendar per application to parse the parameter mappings. There will be some common
	 *  parameters for all requests, with the following:
	 *  	OPERATION_TYPE - The type of request for each calendar to make. For example, OpenAirCalendar could expect a type of "Booking" request to be returned.
	 *  	START_DATE - The start date of the time period to look for events in the form of yyyy-MM-dd'T'HH:mm:ss.SSSZ
	 *  	END_DATE - The end date of the time period to look for events in the form of yyyy-MM-dd'T'HH:mm:ss.SSSZ
	 *  
	 *  There may be other constants not mentioned - for further reference, please read the CSConstants documentation.
	 *  	
	 * @return A parsed event object from the calendar.
	 */
	
	public abstract ArrayList<CSEvent> getEvents(Map<String,String> requestParams) throws ParseException ;
	
	/**
	 * Set an event for the given calendar.
	 * 
	 * @param event A CSEvent object with populated fields to set onto the calendar.
	 * @param requestParams 
	 */
	public abstract void setEvent(CSEvent event, Map<String, String> requestParams);
}
