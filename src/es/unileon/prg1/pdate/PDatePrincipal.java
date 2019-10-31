package es.unileon.prg1.pdate;

public class PDatePrincipal {
	public static void main (String[] args) {
		
		Date myfecha= new Date();
		Date myFecha2=new Date(06, 06 ,2001);
		
		if (myfecha.issameYear(myFecha2)) {
			System.out.println("Es la misma fecha");
		}
		else {
			System.out.println("Son fechas distintas");
		}
		
	}
}
