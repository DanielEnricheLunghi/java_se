package day_14.ereditarietà;
import java.time.LocalDate;
public class PersonaTest {

	public static void main(String[] args) {
		

	Persona adamo = new Uomo("CFU", "Romeo", "Rossi", LocalDate.of(1966, 6, 6), "Verona", true);
	Persona eva = new Donna("CFD", "Giulietta", "Verdi", LocalDate.of(1965, 5, 5), "Verona", "Rosa");

	// NB: il toString viene ereditato dalla classe padre in questo caso Persona
	//System.out.println(adamo.toString());
	//System.out.println(eva.toString());
	Persona [] persone = {adamo, eva};
	for(Persona p : persone ) {
		System.out.println(p);
	}
		
		

	}

}
