package codicebrutto;

public class Brutta {

	public static void main(String[] args) {
//calcola min max di array
		int[] numeri = { 50, 10, 20, 30, 40, 10 };

		 int min = numeri[0];
		 int max = numeri[0];
		// oppure
		//int min = Integer.MAX_VALUE;
		//int max = Integer.MIN_VALUE;
		//esempio con errore
		//int min = 0;
		//int max = 0;
		for (int i = 0; i < numeri.length; i++) {
			if (min > numeri[i]) {
				min = numeri[i];
			}
			if (max < numeri[i]) {
				max = numeri[i];
			}
		}
		System.out.println("numeri min e "+ min + " max è " + max);

	}
	

}
