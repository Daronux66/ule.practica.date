package es.unileon.prg1.pdate;

	/**
	 * Practica Date
	 * @author
	 * @
	 * */

public class Date {
	
	private int day,month,year;
	
	/** 
	 *Constructor de la clase Date 
	 **/
	public Date() {
		this.day=1;
		this.month=1;
		this.year=1;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date(int day, int month, int year) {
		// TODO Auto-generated constructor stub
	}
	
	

	public boolean issameYear(Date miFecha) {
		boolean retorno =false;
		
		if(this.year==miFecha.getYear()) {
			retorno=true;
		}
		return retorno;
	}
	 
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}