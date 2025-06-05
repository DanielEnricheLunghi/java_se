package day_12;

public class Stipendio {
	
	public static void gestioneStipendio(Employee emp, double aumenta){
		double incremento = emp.getStipendio() * (1 + aumenta);
		emp.setStipendio(incremento + aumenta);
		
		
		
	}

}
