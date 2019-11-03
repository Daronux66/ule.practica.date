package es.unileon.prg1.pdate;

public class MainDate {

	public static void main(String[] args) throws DateException {

		Date today;
		Date fecha2;

		today = new Date(99, 14, 2017);
		fecha2 = new Date(99, 14, 2017);
		
		System.out.println(today.toString());
	}
}
