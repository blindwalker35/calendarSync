package configuration.xml;

import generics.objects.CSConstants;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import modules.google.filter.GoogleFilter;
import modules.openair.filter.OpenAirFilter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import configuration.filter.CSFilter;
import configuration.manager.UserConfigurationManager;
import configuration.user.UserConfig;

public class XMLReader {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static UserConfigurationManager readConfigurationManager(String fileReadPath)
	{

		//Read in the XML file
		File xmlFile = new File(fileReadPath);
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder;
		Document document;

		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		try {
			document = documentBuilder.parse(xmlFile);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		//Normalize the xml contents
		document.getDocumentElement().normalize();

		UserConfigurationManager configurationManager = new UserConfigurationManager();
		NodeList userConfigNodeList = document.getElementsByTagName(CSConstants.XML_USERCONFIG);
		NodeList sourceNodeList,
		 destinationNodeList,
		 filterNodeList,
		 filterAttributeNodeList;
		Node userConfigNode,
		sourcesNode, sourceNode,
		destinationsNode, destinationNode,
		filtersNode, filterNode,
		filterAttributeNode;

		Element userConfigElement,
		sourcesElement, sourceElement,
		destinationsElement, destinationElement,
		filtersElement, filterElement,
		filterAttributeElement;

		String userConfigUniqueID;
		Set<String> userConfigSources = new HashSet<String>();
		Set<String> userConfigDestinations = new HashSet<String>();
		Map<String, CSFilter> userConfigFilters = new HashMap<String, CSFilter>();
		
		CSFilter csfilter;
		String filterType;
		
		for(int i = 0; i < userConfigNodeList.getLength(); i++)
		{
			userConfigNode = userConfigNodeList.item(i);
			if(userConfigNode.getNodeType() == Node.ELEMENT_NODE)
			{
				userConfigElement = (Element) userConfigNode;
				userConfigUniqueID = userConfigElement.getAttribute(CSConstants.XML_USERCONFIG_UID_ATTR);

				//Extract sources - should only be one sources node
				sourcesNode = userConfigElement.getElementsByTagName(CSConstants.XML_USERCONFIG_SOURCES).item(0);
				if(sourcesNode.getNodeType() == Node.ELEMENT_NODE)
				{
					sourcesElement = (Element) sourcesNode;
					sourceNodeList = sourcesElement.getElementsByTagName(CSConstants.XML_USERCONFIG_SOURCES_SOURCE);

					for(int src = 0; src < sourceNodeList.getLength(); src++)
					{
						sourceNode = sourceNodeList.item(src);
						if(sourceNode.getNodeType() == Node.ELEMENT_NODE)
						{
							sourceElement = (Element) sourcesNode;
							userConfigSources.add(sourceElement.getTextContent().trim());
						}
					}
				}

				//Extract destinations - should only be one destinations node
				destinationsNode = userConfigElement.getElementsByTagName(CSConstants.XML_USERCONFIG_DESTINATIONS).item(0);
				
				if(destinationsNode.getNodeType() == Node.ELEMENT_NODE)
				{
					destinationsElement = (Element) destinationsNode;
					destinationNodeList = destinationsElement.getElementsByTagName(CSConstants.XML_USERCONFIG_DESTINATIONS_DESTINATION);
					
					for(int dst = 0; dst < destinationNodeList.getLength(); dst++)
					{
						destinationNode = destinationNodeList.item(dst);
						if(destinationNode.getNodeType() == Node.ELEMENT_NODE)
						{
							destinationElement = (Element) destinationNode;
							userConfigDestinations.add(destinationElement.getTextContent().trim());
						}
					}
				}
				//Extract filters - should only be one filters node
				filtersNode = userConfigElement.getElementsByTagName(CSConstants.XML_USERCONFIG_FILTERS).item(0);
				
				if(filtersNode.getNodeType() == Node.ELEMENT_NODE)
				{
					filtersElement = (Element) filtersNode;
					filterNodeList = filtersElement.getElementsByTagName(CSConstants.XML_USERCONFIG_FILTERS_FILTER);
					
					for(int fltr = 0; fltr < filterNodeList.getLength(); fltr++)
					{
						filterNode = filterNodeList.item(fltr);
						if(filterNode.getNodeType() == Node.ELEMENT_NODE)
						{
							filterElement = (Element) filterNode;
							//Returns the appropriate filter object
							filterType = filterElement.getAttribute(CSConstants.XML_USERCONFIG_FILTERS_FILTER_ID_ATTR);
							
							csfilter = getFilterObject(filterType);
							
							filterAttributeNodeList = filterElement.getElementsByTagName(CSConstants.XML_USERCONFIG_FILTERS_FILTER_ATTRIBUTE);
							for(int fltrAttr = 0 ; fltrAttr < filterAttributeNodeList.getLength(); fltrAttr++)
							{
								filterAttributeNode = filterAttributeNodeList.item(fltrAttr);
								if(filterNode.getNodeType() == Node.ELEMENT_NODE)
								{
									filterAttributeElement = (Element) filterAttributeNode;
									
									csfilter.set(filterAttributeElement.getAttribute(CSConstants.XML_USERCONFIG_FILTERS_FILTER_ATTRIBUTE_ID_ATTR),
											filterAttributeElement.getTextContent().trim());
									
								}
							}
							
							userConfigFilters.put(filterType, csfilter);
						}
					}
				}
				configurationManager.set(userConfigUniqueID, new UserConfig(userConfigUniqueID, userConfigSources, userConfigDestinations, userConfigFilters));
			}
		}

		return configurationManager;
	}

	private static CSFilter getFilterObject(String filterID)
	{
		if(filterID.equals(CSConstants.CONFIGURATIONMANAGER_FILTER_NAME_GOOGLECALENDAR))
		{
			return new GoogleFilter();
		}
		if(filterID.equals(CSConstants.CONFIGURATIONMANAGER_FILTER_NAME_OPENAIR))
		{
			return new OpenAirFilter();
		}
		return null;
	}
}
