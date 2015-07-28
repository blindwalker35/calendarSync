package drivers;

import java.io.IOException;

import testing.CalendarSyncProperties;
import testing.GoogleCalendarDriver;
import testing.OpenAirDriver;


public class Driver {
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
		
		
		//Test Google Calendar
//		GoogleCalendarDriver gcd = new GoogleCalendarDriver(csp);
//		gcd.execute();
		
		//Test Open Air
		OpenAirDriver oad = new OpenAirDriver(csp);
		oad.execute();
		

	}	
}
