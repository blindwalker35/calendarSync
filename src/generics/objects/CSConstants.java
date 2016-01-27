package generics.objects;

import java.text.SimpleDateFormat;

public class CSConstants {
	
	//CalendarSync constants
	public static final int YEAR_CONSTANT = 1900;
	public static final int MIN_YEAR = 2010;
	public static final int MAX_YEAR = 2020;
	public static final String UNIQUE_EVENT_ID = "uniqueEventID";
	public static final String EVENT_DESCRIPTION_DELIMITER = "\n\n";
	public static final String EVENT_KEY_VALUE_DELIMITER = ":";
	public static final String OA_CONVERSION_TYPE = "OpenAir_";
	
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
	public static final String CSPROPERTY_LOG_LEVEL = "LOG_LEVEL";
	
	//RequestParam map key constants
	public static final String REQUEST_PARAM_START_DATE="START_DATE";
	public static final String REQUEST_PARAM_END_DATE="END_DATE";
	public static final String REQUEST_PARAM_OPERATION_TYPE="OPERATION_TYPE";
	
	//RequestParam GoogleCalendar key constants
	public static final String REQUEST_PARAM_GOOGLE_CALENDAR_ID = "CALENDAR_ID";
	
	//Google constants
	public static final SimpleDateFormat SIMPLE_DATE_FORMAT_GOOGLE =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	
	//OpenAir constants
	public static final String OPENAIR_SANDBOX_ENDPOINT="https://sandbox.openair.com/soap";
	public static final int OPENAIR_REQUEST_COUNT_LIMIT = 10;
	public static final int OPENAIR_RESPONSE_COUNT_LIMIT = 1000;
	public static final SimpleDateFormat SIMPLE_DATE_FORMAT_OPENAIR =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static final String REQUEST_PARAM_OPENAIR_USERID = "OPENAIR_USERID";
	
	//Caching constants
	public static final String CACHE_OPENAIR = "OPENAIR";
	public static final String CACHE_OPENAIR_UID = CACHE_OPENAIR+"_USERID";
	public static final String CACHE_OPENAIR_PROJECTID = CACHE_OPENAIR+"_PROJECT";
	
	//XML Constants
	public static final String XML_ROOTELEMENT = "Configuration";
	public static final String XML_USERCONFIG = "UserConfig";
	public static final String XML_USERCONFIG_UID_ATTR = "uid";
	public static final String XML_USERCONFIG_SOURCES = "Sources";
	public static final String XML_USERCONFIG_SOURCES_SOURCE = "Source";
	public static final String XML_USERCONFIG_DESTINATIONS = "Destinations";
	public static final String XML_USERCONFIG_DESTINATIONS_DESTINATION = "Destination";
	public static final String XML_USERCONFIG_FILTERS = "Filters";
	public static final String XML_USERCONFIG_FILTERS_FILTER = "Filter";
	public static final String XML_USERCONFIG_FILTERS_FILTER_ID_ATTR = "id";
	public static final String XML_USERCONFIG_FILTERS_FILTER_ATTRIBUTE = "Attribute";
	public static final String XML_USERCONFIG_FILTERS_FILTER_ATTRIBUTE_ID_ATTR = "name";
	
	//Configuration Manager constants
	public static final String CONFIGURATIONMANAGER_FILTER_NAME_OPENAIR = "OpenAir";
	public static final String CONFIGURATIONMANAGER_FILTER_NAME_GOOGLECALENDAR = "Google";
	
	//Testing Variables
	public static final String CALENDARSYNC_PROPERTIES_FILENAME = "/Users/ttakahashi/Desktop/Projects/Self_Utilities/CalendarSyncProperties/creds.properties";
	public static final String CACHE_CONFIG_FILENAME = "/Users/ttakahashi/Desktop/Projects/Self_Utilities/CalendarSyncProperties/cache.ccf";
	public static final String XML_WRITER_FILENAME = "/Users/ttakahashi/Desktop/Projects/Self_Utilities/CalendarSyncProperties/configuration.xml";
	
	
}
