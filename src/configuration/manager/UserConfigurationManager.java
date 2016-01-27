package configuration.manager;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import configuration.user.UserConfig;

public class UserConfigurationManager {
	private Map<String, UserConfig> configurations;
	
	public UserConfigurationManager(){this.configurations = new HashMap<String, UserConfig>();}
	public UserConfig get(String uid){return this.configurations.get(uid);}
	public void set(String uniqueID, UserConfig config){this.configurations.put(uniqueID, config);}
	public Set<Entry<String,UserConfig>> getEntrySet(){return this.configurations.entrySet();}
}
