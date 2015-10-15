package testing;

import generics.objects.CSConstants;
import generics.objects.CSEvent;
import google.calendar.GoogleCalendar;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import openair.calendar.CSOAOPERATIONS;
import openair.calendar.OpenAirCalendar;
import openair.calendar.OpenAirCalendarFactory;

public class TestDriver {

	private CalendarSyncProperties properties;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public TestDriver(CalendarSyncProperties properties)
	{
		this.properties = properties;
	}

	public void execute()
	{
		testOaToGoogle("78");
	}
	
	//Test Cross Platform Functions
	public void testOaToGoogle(String userID)
	{
		
		OpenAirCalendarFactory oacf = new OpenAirCalendarFactory();
		OpenAirCalendar oac = oacf.getInstanceOfOpenAirCalendar(this.properties);

		GoogleCalendar gc = null;
		try {
			gc = new GoogleCalendar(this.properties);
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String,String> requestParamsOA = new HashMap<String, String>();
		requestParamsOA.put(CSConstants.REQUEST_PARAM_START_DATE, "2015-09-15 0:0:0");
		requestParamsOA.put(CSConstants.REQUEST_PARAM_END_DATE, "2015-10-14 23:59:59");
		requestParamsOA.put(CSConstants.REQUEST_PARAM_OPERATION_TYPE, CSOAOPERATIONS.BOOKINGS_BY_UID.value());
		requestParamsOA.put(CSConstants.REQUEST_PARAM_OPENAIR_USERID, userID);
		
		ArrayList<CSEvent> events = null;
		try {
			events = oac.getEvents(requestParamsOA);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String,String> requestParamsGoogle = new HashMap<String, String>();
		requestParamsGoogle.put(CSConstants.REQUEST_PARAM_GOOGLE_CALENDAR_ID, this.properties.getProperties().getProperty(CSConstants.CSPROPERTY_CALENDARNAME));
		
		for(CSEvent event: events)
		{
			gc.setEvent(event, requestParamsGoogle);
		}
		
	}
}
