package gson.objects;

public class ReminderJSON {
	private String method;
	private int minutes;
	
	public ReminderJSON(String method, int minutes)
	{
		this.method = method;
		this.minutes = minutes;
	}
	
	
	public String getMethod(){return this.method;}
	public int getMinutes(){return this.minutes;}
	
	public String toString(int tabCount)
	{
		String tabs = "\n\t";
		for(int i = 0; i < tabCount; i++)tabs+="\t";
		String output = tabs+"Reminder: ";
		tabs+="\t";
		output+=tabs+"Method: "+this.method;
		output+=tabs+"Minutes: " + this.minutes;
		
		return output;
	}
}
