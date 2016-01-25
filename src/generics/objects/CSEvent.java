package generics.objects;

import java.util.Date;

/**
 * The intermediary object type between different calendar objects. All calendars should be capable of converting events into CSEvents.
 * All calendars should be capable of setting CSEvents into their calendar.
 * 
 * @author ttakahashi
 *
 *StartDate is the Date this event begins at.
 *EndDate is the Date this event ends at.
 *Subject is the name of the event.
 *Description is a summary of the event.
 */
public class CSEvent {
	Date startDate;
	Date endDate;
	String subject;
	String description;
	String uniqueIdentifier;
	
	public CSEvent(){}
	
	public CSEvent(Date startDate, Date endDate, String subject, String description, String uniqueIdentifier)
	{
		this.startDate = startDate;
		this.endDate = endDate;
		this.subject = subject;
		this.description = description;
		this.uniqueIdentifier = uniqueIdentifier;
	}
	
	public Date getStartDate(){return this.startDate;}
	public Date getEndDate(){return this.endDate;}
	public String getSubject(){return this.subject;}
	public String getDescription(){return this.description;}
	public String getUniqueIdentifier(){return this.uniqueIdentifier;}
	public String toString()
	{
		String retString = "";
		retString += "StartDate: " + this.startDate + "\n";
		retString += "EndDate: " + this.endDate + "\n";
		retString += "Subject: " + this.subject + "\n";
		retString += "Description: " + this.description + "\n";
		retString += "uniqieEventID: " + this.uniqueIdentifier + "\n";
		return retString;
	}
	
}
