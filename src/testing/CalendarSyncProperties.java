package testing;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.logging.Logger;
import java.util.Properties;

public class CalendarSyncProperties {
	
	private Properties properties;
	private String filepath;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public CalendarSyncProperties(){}
	public CalendarSyncProperties(String filepath)
	{
		this.filepath=filepath;
	}
	
	public void loadFile() throws IOException
	{
		this.properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("/Users/ttakahashi/Desktop/Projects/Self_Utilities/CalendarSyncProperties/creds.properties");
		
		if(fileInputStream != null)
		{
			this.properties.load(fileInputStream);
		}
	}
	
	public String toString()
	{
		String retString = "";
		for(Entry<Object, Object> entry: this.properties.entrySet())
		{
			retString+= entry.getKey()+"="+entry.getValue()+"\n";
		}
		return retString;
	}
	
	public Properties getProperties()
	{
		return this.properties;
	}
}
