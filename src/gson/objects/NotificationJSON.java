package gson.objects;

public class NotificationJSON {
	private String method;
	private String type;
	
	public NotificationJSON(String method, String type)
	{
		this.method = method;
		this.type = type;
	}
	
	public String getMethod(){return this.method;}
	public String getType(){return this.type;}
	
	public String toString(int tabCount)
	{
		String tabs = "\n\t";
		for(int i = 0; i < tabCount; i++)tabs+="\t";
		String output=tabs+"Notification: ";
		tabs+="\t";
		
		output+=tabs+"Method: "+this.method;
		output+=tabs+"Type: "+this.type;
		
		return output;
	}
}
