package gson.objects;

import java.util.List;

public class NotificationSettingsJSON {
	private List<NotificationJSON> notifications;
	
	public NotificationSettingsJSON(List<NotificationJSON> notifications)
	{
		this.notifications = notifications;
	}
	
	public List<NotificationJSON> getNotifications(){return this.notifications;}
	
	public String toString(int tabCount)
	{
		String tabs = "\n\t";
		for(int i = 0; i < tabCount; i++)tabs+="\t";

		String output=tabs+"Notifications: ";
		tabs+="\t";
		
		if(this.notifications != null)
		{
			for(NotificationJSON notification: this.notifications)
			{
				output+=notification.toString(tabCount+1);
			}
		}

		return output;
	}
}
