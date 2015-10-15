package generics.helpers;

import generics.objects.CSConstants;
import generics.objects.CSMONTHS;

import java.util.Date;
import java.util.logging.Logger;

public class CalendarSyncHelper {
	
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * There isn't a particularly good built in way to increment a date in an object class - would have to use
	 * Java Calendar object - but due to Google package imports, would have to provide full package name to use
	 * the Java Calendar instead of Google Calendar. Out of preference, creating this unnecessary package. Could
	 * and should remove this method though.
	 * <p/>
	 * <p/>Notes:
	 * <p/>-Years in the date object are based on 1900, so will have to subtract 1900 from all years 
	 * <p/>-Months in a date object are 0-indexed, so must subtract when using enum
	 * <p/>-Currently does NOT account for any changes in time for time zones, such as daylight savings.
	 * 
	 * @param month	The month to increment a day to.
	 * @param day	The day to increment a day to. The input should be between the values of 0-30, depending on the month.
	 * @param year	The year to increment a day to. The year should be the current year minus 1900.
	 * @return	The new Date after incrementing by one day.
	 */
	@SuppressWarnings("deprecation")
	public static Date datePlusOne(CSMONTHS month, int day, int year)
	{
		LOGGER.finer("Incrementing date...");
		LOGGER.finest("Input: " + month.getMonth()+"/" + day +"/" + year);
		if(isValidDay(month, day+1, year))
		{
			return new Date(year-CSConstants.YEAR_CONSTANT, month.getMonth()-1, day+1);
			/*Only reason to fail date validity is if the month or year rolled over
			 * IsValidDay also accounts for leap years, so only rollovers are in the else
			 */
		}else
		{
			if(month == CSMONTHS.JAN)
			{
				return new Date(year-CSConstants.YEAR_CONSTANT, CSMONTHS.FEB.getMonth()-1, 1);
			}else if(month == CSMONTHS.FEB)
			{
				return new Date(year-CSConstants.YEAR_CONSTANT, CSMONTHS.MAR.getMonth()-1, 1);
			}else if(month == CSMONTHS.MAR)
			{
				return new Date(year-CSConstants.YEAR_CONSTANT, CSMONTHS.APR.getMonth()-1, 1);
			}else if(month == CSMONTHS.APR)
			{
				return new Date(year-CSConstants.YEAR_CONSTANT, CSMONTHS.MAY.getMonth()-1, 1);
			}else if(month == CSMONTHS.MAY)
			{
				return new Date(year-CSConstants.YEAR_CONSTANT, CSMONTHS.JUN.getMonth()-1, 1);
			}else if(month == CSMONTHS.JUN)
			{
				return new Date(year-CSConstants.YEAR_CONSTANT, CSMONTHS.JUL.getMonth()-1, 1);
			}else if(month == CSMONTHS.JUL)
			{
				return new Date(year-CSConstants.YEAR_CONSTANT, CSMONTHS.AUG.getMonth()-1, 1);
			}else if(month == CSMONTHS.AUG)
			{
				return new Date(year-CSConstants.YEAR_CONSTANT, CSMONTHS.SEP.getMonth()-1, 1);
			}else if(month == CSMONTHS.SEP)
			{
				return new Date(year-CSConstants.YEAR_CONSTANT, CSMONTHS.OCT.getMonth()-1, 1);
			}else if(month == CSMONTHS.OCT)
			{
				return new Date(year-CSConstants.YEAR_CONSTANT, CSMONTHS.NOV.getMonth()-1, 1);
			}else if(month == CSMONTHS.NOV)
			{
				return new Date(year-CSConstants.YEAR_CONSTANT, CSMONTHS.DEC.getMonth()-1, 1);
			}else if(month == CSMONTHS.DEC)
			{
				return new Date(year+1-CSConstants.YEAR_CONSTANT, CSMONTHS.JAN.getMonth()-1, 1);
			}else
			{
				return null;
			}
		}
	}
	
	/**
	 * Validate whether a given month, day, and year combination is valid. This also accounts for leap years.
	 * 
	 * @param month	The month to validate.
	 * @param day	The day to validate. The day provided must be a value between 1 and 31, depending on the month.
	 * @param year	The year to validate. The year should be current year (for example, 2015).
	 * @return	Returns a boolean value whether the provided month, day, and year is a valid date.
	 */
	public static boolean isValidDay(CSMONTHS month, int day, int year)
	{
		LOGGER.finer("Validating date...");
		LOGGER.finest("Input: " + month.getMonth()+"/" + day +"/" + year);
		
		if(year < CSConstants.MIN_YEAR || year > CSConstants.MAX_YEAR){return false;}
		if(day < 1){return false;}

		if(month == CSMONTHS.JAN)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.FEB)
		{
			int feb_max = 28;
			if((year%4)==0)
			{
				feb_max=29;
			}
			if(day > feb_max)
			{
				return false;
			}
		}else if(month == CSMONTHS.MAR)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.APR)
		{
			if(day > 30)
			{
				return false;
			}
		}else if(month == CSMONTHS.MAY)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.JUN)
		{
			if(day > 30)
			{
				return false;
			}
		}else if(month == CSMONTHS.JUL)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.AUG)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.SEP)
		{
			if(day > 30)
			{
				return false;
			}
		}else if(month == CSMONTHS.OCT)
		{
			if(day > 31)
			{
				return false;
			}
		}else if(month == CSMONTHS.NOV)
		{
			if(day > 30)
			{
				return false;
			}
		}else if(month == CSMONTHS.DEC)
		{
			if(day > 31)
			{
				return false;
			}
		}
		return true;
	}
}
