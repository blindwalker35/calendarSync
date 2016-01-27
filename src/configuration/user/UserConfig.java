package configuration.user;

import java.util.Map;
import java.util.Set;

import configuration.filter.CSFilter;

public class UserConfig {
	private String uniqueID;
	private Set<String> sources;
	private Set<String> destinations;
	private Map<String, CSFilter> filters;
	
	public UserConfig(String uniqueID, Set<String> sources, Set<String> destinations, Map<String, CSFilter> filters)
	{
		this.uniqueID = uniqueID;
		this.sources = sources;
		this.destinations = destinations;
		this.filters = filters;
	}
	
	//Getters
	public String getUniqueID(){return this.uniqueID;}
	public Set<String> getSources(){return this.sources;}
	public Set<String> getDestinations(){return this.destinations;}
	public Map<String, CSFilter> getFilters(){return this.filters;}
	
	//Setters
	public void setUniqueID(String uniqueID){this.uniqueID = uniqueID;}
	
	/**
	 * Sets a source. If source already exists in the destination, then fails and returns false.
	 * @param source The name of the module to be used as a source. Calendar events will be read from this source.
	 * @return True if source is successfully added to the list of sources. False if provided source already exists in the list of destinations, since it cannot be a source and a destination at the same time.
	 */
	public boolean setSource(String source)
	{
		if(this.destinations.contains(source)){return false;}
		this.sources.add(source);
		return true;
	}
	
	/**
	 * Sets a destination. If destination already exists in the sources, then fails and returns false.
	 * @param source The name of the module to be used as a destination. Calendar events will be written to this destination.
	 * @return True if destination is successfully added to the list of destination. False if provided destination already exists in the list of sources, since it cannot be a source and a destination at the same time.
	 */
	public boolean setDestination(String destination)
	{
		if(this.sources.contains(destination)){return false;}
		this.destinations.add(destination);
		return true;
	}
	
	public void setFilter(String filterName, CSFilter filter)
	{
		this.filters.put(filterName, filter);
	}
}
