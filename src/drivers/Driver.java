package drivers;

import google.test.GoogleCalendarDriver;


public class Driver {
	public static void main(String[] args)
	{	
		//Test Google Calendar
		GoogleCalendarDriver gcd = new GoogleCalendarDriver();
		gcd.execute();
	}	
}
