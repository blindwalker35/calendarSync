package logging;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CalendarSyncFormatter extends Formatter
{
	@Override
	public String format(LogRecord logRecord) {
		// TODO Auto-generated method stub
		
		String message = "";
		
		message += "<" + convertMStoDate(logRecord.getMillis()) + ">";
		message += "<" + logRecord.getLevel() + ">";
		message += "<" + logRecord.getSourceClassName() +"." + logRecord.getSourceMethodName() + ">";
		message += formatMessage(logRecord);
		message += "\n";
		return message;
	}
	
	private String convertMStoDate(long milliseconds)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");
		Date date = new Date(milliseconds);
		return sdf.format(date);
	}
	
}
