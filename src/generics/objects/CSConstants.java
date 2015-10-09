package generics.objects;

import java.text.SimpleDateFormat;

public class CSConstants {
	
	public static final int YEAR_CONSTANT = 1900;
	public static final int MIN_YEAR = 2010;
	public static final int MAX_YEAR = 2020;
	public static final CSMONTHS CSMONTHS_SNGL = CSMONTHS.JAN;
	
	//Property file properties
	public static final String CSPROPERTY_CALENDARNAME = "calendarName";
	public static final String CSPROPERTY_CLIENTID = "clientID";
	public static final String CSPROPERTY_CLIENTSECRET = "clientSecret";
	public static final String CSPROPERTY_OPENAIR_COMPANY = "company";
	public static final String CSPROPERTY_OPENAIR_API_NAMESPACE = "apiNamespace";
	public static final String CSPROPERTY_OPENAIR_API_KEY = "apiKey";
	public static final String CSPROPERTY_OPENAIR_CLIENTNAME = "clientName";
	public static final String CSPROPERTY_OPENAIR_CLIETVERSION = "clientVersion";
	public static final String CSPROPERTY_OPENAIR_USERNAME = "username";
	public static final String CSPROPERTY_OPENAIR_PASSWORD = "password";
	
	//RequestParam map key constants
	public static final String REQUEST_PARAM_START_DATE="START_DATE";
	public static final String REQUEST_PARAM_END_DATE="END_DATE";
	public static final String REQUEST_PARAM_OPERATION_TYPE="OPERATION_TYPE";
	
	//RequestParam GoogleCalendar key constants
	public static final String REQUEST_PARAM_GOOGLE_CALENDAR_ID = "CALENDAR_ID";
	
	//Google constants
	//The date format that will be used
	public static final SimpleDateFormat SIMPLE_DATE_FORMAT_GOOGLE =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	
	//OpenAir constants
	public static final String OPENAIR_SANDBOX_ENDPOINT="https://sandbox.openair.com/soap";
	public static final int OPENAIR_REQUEST_COUNT_LIMIT = 10;
	public static final int OPENAIR_RESPONSE_COUNT_LIMIT = 1000;
	public static final SimpleDateFormat SIMPLE_DATE_FORMAT_OPENAIR =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static final String REQUEST_PARAM_OPENAIR_USERID = "OPENAIR_USERID";
	
}
