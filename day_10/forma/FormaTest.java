package day_10.forma;

public class FormaTest {

	public static void main(String[] args) {
		Quadrato quadrato1 = new Quadrato(10.0);
		Forma cerchio1 = new Cerchio(10.0);
		//Forma forma1 = new Forma(10.0);
		//dichiarando forma come abstract non posso piu instanziarla
		System.out.println("perimetro quadrato " + FormaController.calcolaPerimetroCirconferenza(quadrato1));
		System.out.println("area quadrato " + FormaController.calcolaArea(quadrato1));
		System.out.println("circonferenza cerchio " + FormaController.calcolaPerimetroCirconferenza(cerchio1));
		System.out.println("area cerchio " + FormaController.calcolaArea(cerchio1));
		//System.out.println("circonferenza forma " + FormaController.calcolaPerimetroCirconferenza(forma1));
		//System.out.println("area forma " + FormaController.calcolaArea(forma1));
		System.out.println(quadrato1.perimetroCirconferenza());
	}
	

}
