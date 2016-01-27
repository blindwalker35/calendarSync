package drivers;

import generics.objects.CSConstants;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;
import org.apache.jcs.engine.control.CompositeCacheManager;

import configuration.manager.UserConfigurationManager;
import configuration.xml.XMLReader;
import configuration.xml.XMLWriter;
import logging.CalendarSyncLogger;
import modules.google.calendar.GoogleCalendar;
import modules.openair.calendar.OpenAirCalendar;
import testing.CalendarSyncProperties;
import testing.GoogleCalendarDriver;
import testing.OpenAirDriver;
import testing.TestDriver;
import testing.XMLWriterDriver;


public class Driver {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args)
	{	
		
		/************************
		 * Read in Properties	*
		 ************************/
		CalendarSyncProperties csp = null;
		try {
			csp = new CalendarSyncProperties(CSConstants.CALENDARSYNC_PROPERTIES_FILENAME);
			csp.loadFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Oh noooooo....");
		}

		/********************
		 * Setup Logging	*
		 ********************/
		try {
			CalendarSyncLogger.setup(Level.parse((String) csp.getProperties().getProperty(CSConstants.CSPROPERTY_LOG_LEVEL)));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/************************
		 * Initialize Caching	*
		 ************************/
		
		final String configFilename = CSConstants.CACHE_CONFIG_FILENAME;
		if(configFilename != null)
		{
			Properties properties = new Properties();
			try {
				properties.load(new FileReader(configFilename));
				CompositeCacheManager ccm = CompositeCacheManager.getUnconfiguredInstance();
				ccm.configure(properties);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/****************************
		 * Read in Configuration	*
		 ****************************/
		
		UserConfigurationManager configurationManager = XMLReader.readConfigurationManager(CSConstants.XML_WRITER_FILENAME);
		
		/****************
		 * Execution	*
		 ****************/
		
		//Test Google Calendar
//		GoogleCalendarDriver gcd = new GoogleCalendarDriver(csp);
//		gcd.execute();
		
		//Test Open Air
//		OpenAirDriver oad = new OpenAirDriver(csp);
//		oad.execute();
		
		//Test Cross Platform
		TestDriver td = new TestDriver(csp);
		td.execute();
		
		//Test XML Writer
		XMLWriterDriver xmlDriver = new XMLWriterDriver();
		xmlDriver.execute();

		
		/************************************
		 * Export existing Configuration	*
		 ************************************/
		
		XMLWriter.writeConfigurationManager(configurationManager, CSConstants.XML_WRITER_FILENAME);
	}	
}
