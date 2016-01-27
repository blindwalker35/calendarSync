package configuration.filter;

import generics.objects.CSEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import configuration.user.UserConfig;

public abstract class CSFilter {
	private Map<String, String> filterAttributes;
	
	public CSFilter(){this.filterAttributes = new HashMap<String, String>();}
	
	public void set(String filterAttributeName, String filterAttributeValue){this.filterAttributes.put(filterAttributeName, filterAttributeValue);}
	public String get(String filterAttributeName){return this.filterAttributes.get(filterAttributeName);}
	public Set<Entry<String,String>> getEntrySet(){return this.filterAttributes.entrySet();}

	public abstract Map<String, CSEvent> filter(Map<String, CSEvent> events);
}
