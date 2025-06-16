package day_15;

public class Matrice {

	public static void main(String[] args) {
		//1: stampa da 0 a 9 numeri
//		for(int i = 0; i <= 9; i++) {
//			System.out.println(i);
//		}
		//2: stampa da 10 a 1 i numeri
//		for(int i = 10; i >= 1; i--) {
//			System.out.println(i);
//		}
		//3: dato array int stampa tutti i valori
//		int[] numeri = {1, 23, 45, 6, 7,};
//		for(int i = 0; i < numeri.length; i++) {
//			System.out.println(numeri[i]);
//		}
		//4: stampa indice e valore di array precedente
//		int[] numeri = {1, 23, 45, 6, 7,};
//		for(int i = 0; i < numeri.length; i++) {
//			System.out.println("indici = " + i + " valore = " + numeri[i]);
//		}
		//5: stampa tutte le coppie di i e j dove i và da 0 a 2 e j da 0 a 3
		for(int i = 0; i <= 2; i++) {
			System.out.println();
			for(int j = 0; j <= 3; j++) {
			System.out.print(i + " " + j);}
			}
	}

}
