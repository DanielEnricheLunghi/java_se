package day_13Esercizi;

public class EsercizioLuhn {

	public static void main(String[] args) {
		String numeri = "4539319503436467";
		int somma = 0;

		boolean raddoppiare = false;

		for (int i = numeri.length() - 1; i >= 0; i--) {
		    int prodotto = numeri.charAt(i) - '0';
		    
		    if (raddoppiare) {
		        prodotto *= 2;
		        if (prodotto > 9) {
		            prodotto -= 9;
		        }
		    }

		    somma += prodotto;
		    raddoppiare = !raddoppiare; // alterna ogni volta
		}

	
		System.out.println(somma);
		


	}

}
