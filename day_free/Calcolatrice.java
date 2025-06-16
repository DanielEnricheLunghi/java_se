package day_free;

public class Calcolatrice {


	static int addizione(int a, int b) {
		int somma = a + b;
		return somma;
	}
	
	static int sottrazione(int a, int b) {
		int meno = a - b;
		return meno;
	}
	static int moltiplicazione(int a, int b) {
		int prodotto = a * b;
		return prodotto;
	}
	static int divisione(int a, int b) {
		int dividendo = a / b;
		return dividendo;
	}
	
	public static void main(String[] args) {
		
		int somma = Calcolatrice.addizione(2, 50);
		System.out.println(somma);
		int sottrazione = Calcolatrice.sottrazione(23, 6);
		System.out.println(sottrazione);
		int prodotto = Calcolatrice.moltiplicazione(32, 4);
		System.out.println(prodotto);
		int divisione = Calcolatrice.divisione(55, 5);
		System.out.println(divisione);

	}
}
