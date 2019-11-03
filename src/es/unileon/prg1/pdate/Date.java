package es.unileon.prg1.pdate;

public class Date {
	private int day;
	private int month;
	private int year;
	
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

	public void setDay(int day) throws DateException {
		if(this.month<8){
			if(this.month%2==0) {
				if(this.month==2) {
					if (this.year%4==0) {
						if (day<=29 && day>0) {
							this.day=day;
						}
						else {
							throw new DateException("ERROR: dia introducido invalido");
						}
					}
					else {
						if (day<=28 && day>0) {
							this.day=day;
						}
						else {
							throw new DateException("ERROR: dia introducido invalido");
						}
					}
				}
				else {
					if (day>0 && day<=30) {
						this.day=day;
					}
					else {
						throw new DateException("ERROR: dia introducido invalido");
					}
				}
			}
			else {
				if (day>0 && day<=31) {
					this.day=day;
				}
				else {
					throw new DateException("ERROR: dia introducido invalido");
				}
			}
		}
		
		else {
			if(this.month%2==0) {
				if (day>0 && day<=31) {
					this.day=day;
				}
				else {
					throw new DateException("ERROR: dia introducido invalido");
				}
			}
			else {
				if (day>0 && day<=30) {
					this.day=day;
				}
				else {
					throw new DateException("ERROR: dia introducido invalido");
				}
			}
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) throws DateException {
		if (month>0 && month<=12) {
			this.month = month;
		}
		else {
			throw new DateException ("ERROR: mes introducido invalido");
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws DateException {
		if (year>0 && year<=12) {
			this.year = year;
		}
		else {
			throw new DateException ("ERROR: ayio introducido invalido");
		}
	}

	public Date(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		//Syso de control (referencia para desarrollo, quitarlo antes de terminar la practica)
		System.out.println(this.day + "/" + this.month + "/" + this.year);
	}

	
	public boolean isSameYear(Date miFecha) {
		boolean retorno =false;
		
		if(this.year==miFecha.getYear()) {
			retorno=true;
		}
		return retorno;
	}
	
	public boolean isSameMonth(Date miFecha) {
		boolean retorno =false;
		
		if(this.month==miFecha.getMonth()) {
			retorno=true;
		}
		return retorno;
	}
	
	public boolean isSameDay(Date miFecha) {
		boolean retorno =false;
		
		if(this.day==miFecha.getDay()) {
			retorno=true;
		}
		return retorno;
	}
	
	public boolean isSame(Date miFecha) {
		boolean retorno =false;
		
		if(isSameDay(miFecha)==true && isSameMonth(miFecha)==true && isSameYear(miFecha)==true) {
			retorno=true;
		}
		return retorno;
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}

