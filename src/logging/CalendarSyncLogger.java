package logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalendarSyncLogger {
	private static FileHandler fileHandler;
	private static Formatter csFormatter;
	
	static public void setup(Level level) throws IOException
	{
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		Logger rootLogger = Logger.getLogger("");
		Handler[] handlers = rootLogger.getHandlers();
		if(handlers[0] instanceof ConsoleHandler)
		{
			rootLogger.removeHandler(handlers[0]);;
		}
		
		logger.setLevel(level);
		fileHandler = new FileHandler("CalendarSyncLogging.txt");
		
		
		csFormatter = new CalendarSyncFormatter();
		fileHandler.setFormatter(csFormatter);
		logger.addHandler(fileHandler);
	}

}
