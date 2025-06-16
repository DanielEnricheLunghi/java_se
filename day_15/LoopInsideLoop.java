package day_15;

public class LoopInsideLoop {

	public static void main(String[] args) {
		//stampiamo coppie dove i è 2 e j è 3
//		for(int i = 0; i <= 2; i++) {
//			
//			for(int j = 0; j <= 3; j++) {
//				System.out.print("(" + i + "," + j + ")");
//			}System.out.println();
//		}
		//stampiamo quadrato numerico
//		1111
//		2222
//		3333
//		4444
//		int numero = 0;
//		for(int i = 1; i <= 4; i++) {
//			numero++;
//			for(int j = 1; j <= 4; j++) {
//				
//				System.out.print(i);
//			}System.out.println();
//		}
		//ESERCIZIO 1: stampiamo quadrato di * 5x5
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}System.out.println();
//		} 
		//ESERCIZIO 2: stampa quadrato di # 4x4
//		for(int i = 0; i <= 3; i++) {
//			for(int j = 0; j <= 3; j++) {
//				System.out.print("#");
//			}System.out.println();
//		}
		//ESERCIZIO 3: scrivi una griglia di numeri come fatto prima
//		for(int i = 0; i <= 3; i++) {
//			for(int j = 0; j <= 3; j++) {
//				System.out.print(i);
//			}System.out.println();
//		}
		//ESERCIZIO 4: stampa 1234 1234 1234 1234 ogni gruppo su una riga
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 1; j <= 4; j++) {
//				System.out.print(j);
//			}System.out.println();
//		}
		//ESERCIZIO 5: stampa i numeri crescenti quindi 1, 12, 123, 1234
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}System.out.println();
//		}
		//ESERCIZIO 6: stampa i numeri di prima ma decrescenti
		for(int i = 4; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}System.out.println();
		}
	}
	

}
