package configuration.xml;

import java.io.File;
import java.util.Map.Entry;
import java.util.logging.Logger;
import java.util.Set;

import generics.objects.CSConstants;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import configuration.filter.CSFilter;
import configuration.manager.UserConfigurationManager;
import configuration.user.UserConfig;

public class XMLWriter
{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void writeConfigurationManager(UserConfigurationManager configurationManager, String fileWritePath)
	{
		LOGGER.info("Initializing XML Writer...");
		//Initialize XML Builder
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder;
		try {
			documentBuilder = documentFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		LOGGER.info("Creating XML structure...");
		//Create XML data structure
		Document document = documentBuilder.newDocument();
		Element rootElement = document.createElement(CSConstants.XML_ROOTELEMENT);
		
		Element userConfigElement,
			sourcesElement, sourceElement,
			destinationsElement, destinationElement,
			filtersElement, filterElement,
			filterAttributeElement;
		
		Attr userConfigAttr, filterAttr, filterElementAttr;
		UserConfig userConfig;
		
		for(Entry<String, UserConfig> configEntry: configurationManager.getEntrySet())
		{
			userConfigElement = document.createElement(CSConstants.XML_USERCONFIG);
			userConfigAttr = document.createAttribute(CSConstants.XML_USERCONFIG_UID_ATTR);
			userConfigAttr.setValue(configEntry.getKey());
			userConfigElement.setAttributeNode(userConfigAttr);
			userConfig = configEntry.getValue();
			
			//Setting up sources config
			sourcesElement = document.createElement(CSConstants.XML_USERCONFIG_SOURCES);			
			for(String source: userConfig.getSources())
			{
				sourceElement = document.createElement(CSConstants.XML_USERCONFIG_SOURCES_SOURCE);
				sourceElement.appendChild(document.createTextNode(source));
				sourcesElement.appendChild(sourceElement);
			}
			userConfigElement.appendChild(sourcesElement);
			
			//Setting up destinations config
			destinationsElement = document.createElement(CSConstants.XML_USERCONFIG_DESTINATIONS);
			for(String destination: userConfig.getDestinations())
			{
				destinationElement = document.createElement(CSConstants.XML_USERCONFIG_DESTINATIONS_DESTINATION);
				destinationElement.appendChild(document.createTextNode(destination));
				destinationsElement.appendChild(destinationElement);
			}
			userConfigElement.appendChild(destinationsElement);
			
			//Setting up filters config
			filtersElement = document.createElement(CSConstants.XML_USERCONFIG_FILTERS);
			for(Entry<String, CSFilter> filterEntry: userConfig.getFilters().entrySet())
			{
				filterElement = document.createElement(CSConstants.XML_USERCONFIG_FILTERS_FILTER);
				filterElementAttr = document.createAttribute(CSConstants.XML_USERCONFIG_FILTERS_FILTER_ID_ATTR);
				filterElementAttr.setValue(filterEntry.getKey());
				filterElement.setAttributeNode(filterElementAttr);
				
				for(Entry<String, String> filterAttribute: filterEntry.getValue().getEntrySet())
				{
					filterAttributeElement = document.createElement(CSConstants.XML_USERCONFIG_FILTERS_FILTER_ATTRIBUTE);
					filterAttr = document.createAttribute(CSConstants.XML_USERCONFIG_FILTERS_FILTER_ATTRIBUTE_ID_ATTR);
					filterAttr.setValue(filterAttribute.getKey());
					filterAttributeElement.appendChild(document.createTextNode(filterAttribute.getValue()));
					filterAttributeElement.setAttributeNode(filterAttr);
					filterElement.appendChild(filterAttributeElement);
				}
				filtersElement.appendChild(filterElement);
			}
			userConfigElement.appendChild(filtersElement);
			
			rootElement.appendChild(userConfigElement);
		}
		document.appendChild(rootElement);
		
		
		LOGGER.info("Writing to file in location: " + fileWritePath);
		//Write XML data structure to file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(new File(fileWritePath));
//		StreamResult result = new StreamResult(System.out);
		
		
		//Set indents on newlines
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		
		try {
			transformer.transform(source, result);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}
}
