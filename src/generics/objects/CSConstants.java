package generics.objects;

import java.text.SimpleDateFormat;

public class CSConstants {
	//The date format that will be used
	public static final SimpleDateFormat SIMPLE_DATE_FORMAT =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	
	
	//RequestParam map key constants
	public static final String REQUEST_PARAM_START_DATE="START_DATE";
	public static final String REQUEST_PARAM_END_DATE="END_DATE";
	public static final String REQUEST_PARAM_OPERATION_TYPE="OPERATION_TYPE";
	
	//RequestParam GoogleCalendar key constants
	public static final String REQUEST_PARAM_CALENDAR_ID = "CALENDAR_ID";
	
	
	//OpenAir constants
	public static final String OPENAIR_SANDBOX_ENDPOINT="https://sandbox.openair.com/soap";
	public static final int OPENAIR_REQUEST_COUNT_LIMIT = 10;
	public static final int OPENAIR_RESPONSE_COUNT_LIMIT = 1000;
}
