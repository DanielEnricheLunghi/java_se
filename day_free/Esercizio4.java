package day_free;
import java.util.ArrayList;
public class Esercizio4 {
	public static void main(String [] args) {
		ArrayList<Integer> numeri = new ArrayList<>();
		int valore = 1;
		for(int i = 0; i < 10; i++) {
			numeri.add(valore);
			valore++;
		}
		System.out.println(numeri);
		numeri.remove(4);
		numeri.set(2, 99);
		System.out.println(numeri);
		for(int numero : numeri) {
			if(numero %2 == 0) {
				System.out.print(numero + " ");
			}
		}
		System.out.println();
		int trovato = 0;
		if(numeri.contains(7)) {
			
			System.out.println("trovato");
		}else {
			System.out.println("non trovato");
		}
		
		
		
	}

}
