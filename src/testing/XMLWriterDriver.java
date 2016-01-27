package testing;

import generics.objects.CSConstants;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import modules.google.filter.GoogleFilter;
import modules.openair.filter.OpenAirFilter;
import configuration.filter.CSFilter;
import configuration.manager.UserConfigurationManager;
import configuration.user.UserConfig;
import configuration.xml.XMLReader;
import configuration.xml.XMLWriter;

public class XMLWriterDriver {
	public void execute()
	{		
		String uniqueID = null;
		Set<String> sources = new HashSet<String>();
		Set<String> destinations = new HashSet<String>();
		Map<String, CSFilter> filters = new HashMap<String, CSFilter>();
		
		uniqueID = "1";
		
		sources.add("OpenAir");
		destinations.add("Google");
		
		CSFilter openairFilter = null, googleFilter = null;
		openairFilter = new OpenAirFilter();
		openairFilter.set("userID", "testuser1");
		
		googleFilter = new GoogleFilter();
		googleFilter.set("username", "testuser1");
		googleFilter.set("calendarId", "abc123");
		
		filters.put(CSConstants.CONFIGURATIONMANAGER_FILTER_NAME_OPENAIR, openairFilter);
		filters.put(CSConstants.CONFIGURATIONMANAGER_FILTER_NAME_GOOGLECALENDAR, googleFilter);
		
		UserConfig userConfig = new UserConfig(uniqueID, sources, destinations, filters);
				
		UserConfigurationManager configurationManager = new UserConfigurationManager();
		configurationManager.set(userConfig.getUniqueID(), userConfig);
		XMLWriter.writeConfigurationManager(configurationManager, CSConstants.XML_WRITER_FILENAME);
		
		UserConfigurationManager configurationManagerReader = XMLReader.readConfigurationManager(CSConstants.XML_WRITER_FILENAME);
		configurationManagerReader.toString();
		
		XMLWriter.writeConfigurationManager(configurationManagerReader, CSConstants.XML_WRITER_FILENAME+"2");
		
		
	}
}
