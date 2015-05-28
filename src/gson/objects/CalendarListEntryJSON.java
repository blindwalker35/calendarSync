package gson.objects;

import java.util.List;

public class CalendarListEntryJSON {
	private String accessRole;
	private String backgroundColor;
	private int colorId;
	private List<ReminderJSON> defaultReminders;
	private String etag;
	private String description;
	private String foregroundColor;
	private String id;
	private NotificationSettingsJSON notificationSettings;
	private String primary;
	private String kind;
	private String selected;
	private String summary;
	private String timeZone;
	
	public CalendarListEntryJSON(String accessRole, String backgroundColor, int colorId, List<ReminderJSON> defaultReminders,
			String etag, String description, String foregroundColor, String id, NotificationSettingsJSON notificationSettings,
			String primary, String kind, String selected, String summary, String timeZone)
	{
		this.accessRole = accessRole;
		this.backgroundColor = backgroundColor;
		this.colorId = colorId;
		this.defaultReminders = defaultReminders;
		this.etag = etag;
		this.description = description;
		this.foregroundColor = foregroundColor;
		this.id = id;
		this.notificationSettings = notificationSettings;
		this.primary = primary;
		this.kind = kind;
		this.selected = selected;
		this.summary = summary;
		this.timeZone = timeZone;
	}
	
	public String getAccessRole(){return this.accessRole;}
	public String getBackgroundColor(){return this.backgroundColor;}
	public int getColorID(){return this.colorId;}
	public List<ReminderJSON> getDefaultReminders(){return this.defaultReminders;}
	public String getETag(){return this.etag;}
	public String getDescription(){return this.description;}
	public String getForegroundColor(){return this.foregroundColor;}
	public String getID(){return this.id;}
	public NotificationSettingsJSON getNotificationSetings(){return this.notificationSettings;}
	public String getPrimary(){return this.primary;}
	public String getKind(){return this.kind;}
	public String getSelected(){return this.selected;}
	public String getSummary(){return this.summary;}
	public String getTimeZone(){return this.timeZone;}
	
	public String toString(int tabCount)
	{
		String tabs = "\n\t";
		for(int i = 0; i < tabCount; i++)tabs+="\t";
		
		String output = tabs+"Calendar List Entry:";
		tabs+="\t";

		if(this.accessRole != null)output+=tabs+"Access Role: "+this.accessRole;
		if(this.backgroundColor != null)output+=tabs+"Background Color: "+this.backgroundColor;
		output+=tabs+"Color ID: "+this.colorId;

		if(this.defaultReminders != null)
		{
			output+=tabs+"Default Reminders: ";
			for(ReminderJSON reminder: this.defaultReminders)
			{
				output+=reminder.toString(tabCount+2);
			}
		}
		if(this.description != null)output+=tabs+"Description: "+this.description;
		if(this.etag != null)output+=tabs+"ETag: "+this.etag;
		if(this.foregroundColor != null)output+=tabs+"Foreground Color: "+this.foregroundColor;
		if(this.id != null)output+=tabs+"ID: "+this.id;
		if(this.kind != null)output+=tabs+"Kind: "+this.kind;
		if(this.notificationSettings != null)output+=tabs+"Notification Settings: "+this.notificationSettings.toString(tabCount+2);
		if(this.primary != null)output+=tabs+"Primary: "+this.primary;
		if(this.selected != null)output+=tabs+"Selected: "+this.selected;
		if(this.summary != null)output+=tabs+"Summary: "+this.summary;
		if(this.timeZone!= null)output+=tabs+"TimeZone: "+this.timeZone;
		
		return output;
	}
}
