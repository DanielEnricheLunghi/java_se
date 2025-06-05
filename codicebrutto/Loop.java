package codicebrutto;

public class Loop {

	public static void main(String[] args) {

		// Stampa numeri che si trovano in posizioni dispari **e** sono pari
		int[] numeri = { 4, 7, 10, 13, 16, 19 };
		for (int i = 0; i < numeri.length; i++) {
			if (i % 2 != 0 && numeri[i] % 2 == 0) {
				System.out.println(i + "  " + numeri[i]);}
		}

	}

}
