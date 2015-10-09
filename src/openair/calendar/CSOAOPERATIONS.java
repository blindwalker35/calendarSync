package openair.calendar;

public enum CSOAOPERATIONS {
	BOOKINGS_BY_UID;
	private String operation;
	public String value()
	{
		switch(this)
		{
		case BOOKINGS_BY_UID:
			return "BOOKINGS_BY_UID";
		}
		return null;
	}
}
