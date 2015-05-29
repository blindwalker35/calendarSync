package generics.objects;

public class CSEvent {
	CSMONTHS month;
	int day;
	int year;
	int hour;
	int minute;
	int second;
	String subject;
	String description;
	
	public CSEvent(CSMONTHS month, int day, int year, int hour, int minute, int second, String subject, String description)
	{
		this.month = month;
		this.day = day;
		this.year = year;
		this.hour = hour;
		this.second = second;
		this.subject = subject;
		this.description = description;
	}
}
