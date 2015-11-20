package generics.objects;

public enum CSMONTHS {
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);

	private CSMONTHS(final int month)
	{
		this.month = month;
	}
	private int month;
	public int getMonth(){return this.month;}
	
	/**
	 * Returns a 1-base indexed instance of CSMONTHS with the appropriate Month.
	 * 	1 = JAN
	 * 	2 = FEB
	 * 	3 = MAR
	 * 	4 = APR
	 * 	5 = MAY
	 * 	6 = JUN
	 *  7 = JUL
	 *  8 = AUG
	 *  9 = SEP
	 *  10 = OCT
	 *  11 = NOV
	 *  12 = DEC
	 * @param month with 1-base index
	 * @return a CSMONTHS object of the appropriate month.
	 */
	public CSMONTHS getMonthWithValue(int month)
	{
		if(month == 1){return this.JAN;}
		if(month == 2){return this.FEB;}
		if(month == 3){return this.MAR;}
		if(month == 4){return this.APR;}
		if(month == 5){return this.MAY;}
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
