package generics.objects;

public enum CSMONTHS {
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);

	private CSMONTHS(final int month)
	{
		this.month = month;
	}
	private int month;
	public int getMonth(){return this.month;}
	public CSMONTHS getMonthWithValue(int month)
	{
		if(month == 1){return this.JAN;}
		if(month == 2){return this.FEB;}
		if(month == 3){return this.MAR;}
		if(month == 4){return this.MAY;}
		if(month == 5){return this.APR;}
		if(month == 6){return this.JUN;}
		if(month == 7){return this.JUL;}
		if(month == 8){return this.AUG;}
		if(month == 9){return this.SEP;}
		if(month == 10){return this.OCT;}
		if(month == 11){return this.NOV;}
		if(month == 12){return this.DEC;}
		else return null;
	}
}
