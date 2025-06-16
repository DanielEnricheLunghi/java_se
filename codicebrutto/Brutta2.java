package codicebrutto;

public class Brutta2 {

	public static void main(String[] args) {
		String numeri = "3745";
		//prendiamo valore e posizione dalla stringa
		for (int i = 0; i < numeri.length(); i++) {
		    int cifra = numeri.charAt(i) - '0';
		    System.out.println("Cifra in posizione " + i + ": " + cifra);
		}

	}

}
