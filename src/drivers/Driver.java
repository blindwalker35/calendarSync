package drivers;

import generics.objects.CSConstants;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;

import logging.CalendarSyncLogger;
import modules.google.calendar.GoogleCalendar;
import modules.openair.calendar.OpenAirCalendar;
import testing.CalendarSyncProperties;
import testing.GoogleCalendarDriver;
import testing.OpenAirDriver;
import testing.TestDriver;


public class Driver {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args)
	{	
		
		//Load properties file from file system which may store sensitive information.
		CalendarSyncProperties csp = null;
		try {
			csp = new CalendarSyncProperties("/Users/ttakahashi/Desktop/Projects/Self_Utilities/CalendarSyncProperties/creds.properties");
			csp.loadFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Oh noooooo....");
		}

		try {
			//CalendarSyncLogger.setup(Level.parse((String) csp.getProperties().getProperty(CSConstants.CSPROPERTY_LOG_LEVEL)));
			CalendarSyncLogger.setup(Level.FINEST);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test Google Calendar
//		GoogleCalendarDriver gcd = new GoogleCalendarDriver(csp);
//		gcd.execute();
		
		//Test Open Air
//		OpenAirDriver oad = new OpenAirDriver(csp);
//		oad.execute();
		
		//Test Cross Platform
		TestDriver td = new TestDriver(csp);
		td.execute();

	}	
}
