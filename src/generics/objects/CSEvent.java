package generics.objects;

import java.util.Date;

public class CSEvent {
	Date startDate;
	Date endDate;
	String subject;
	String description;
	
	public CSEvent(){}
	
	public CSEvent(Date startDate, Date endDate, String subject, String description)
	{
		this.startDate = startDate;
		this.endDate = endDate;
		this.subject = subject;
		this.description = description;
	}
	
	public Date getStartDate(){return this.startDate;}
	public Date getEndDate(){return this.endDate;}
	public String getSubject(){return this.subject;}
	public String getDescription(){return this.description;} 
}
