package google.gson;

import java.util.List;

public class CalendarListJSON {
	private String etag;
	private List<CalendarListEntryJSON> items;
	private String kind;
	private String nextSyncToken;
	
	public CalendarListJSON(String etag, List<CalendarListEntryJSON> items, String kind, String nextSyncToken)
	{
		this.etag = etag;
		this.items = items;
		this.kind = kind;
		this.nextSyncToken = nextSyncToken;
	}
	
	
	public String getETag(){return this.etag;}
	public List<CalendarListEntryJSON> getCalendarListEntries(){return this.items;}
	public String getKind(){return this.kind;}
	public String getNextSyncToken(){return this.nextSyncToken;}
	
	public String toString(int tabCount)
	{
		String tabs = "\n";
		for(int i = 0; i < tabCount; i++)tabs+="\t";
		String output=tabs+"Calendar List: ";
		tabs+="\t";
		
		if(this.etag != null)output+=tabs+"ETag: "+this.etag;
		
		output+=tabs+"Items: ";
		if(this.items != null)
		{
			for(CalendarListEntryJSON item: this.items)
			{
				output+=item.toString(tabCount+1);
			}
		}
		if(this.kind != null)output+=tabs+"Kind: "+this.kind;
		if(this.nextSyncToken != null)output+=tabs+"NextSyncToken"+this.nextSyncToken;
		
		return output;
	}

}
