package modules.openair.calendar;

import testing.CalendarSyncProperties;

/**
 * 
 * @author ttakahashi
 *
 *Since an OpenAirCalendar object should never be used without being logged in, a factory design pattern is used here.
 *This factory will return an instance of an OpenAirCalendar that is already logged in, provided the CalendarSyncProperties.
 *
 */

public class OpenAirCalendarFactory {
	public OpenAirCalendarFactory(){};
	
	public OpenAirCalendar getInstanceOfOpenAirCalendar(CalendarSyncProperties properties)
	{
		OpenAirCalendar oac = new OpenAirCalendar(properties);
		oac.login();
		return oac;
	}
}
