package day_04;

public class Esercizi_08 {

	public static void main(String[] args) {
		int[] numeri = {10, 20, 30, 340, 20,};
		int numeroTrovare = 20;
		int posizione = -1;
		for(int i = 0; i < numeri.length; i++) {
			if(numeri[i] == numeroTrovare) {
				posizione = i;
				break;
			}
		}if(posizione != -1) {
			System.out.println("posizione è " + posizione);
		}else {System.out.println("elemento non presente");}

	}

}
