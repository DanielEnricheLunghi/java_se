package day_free;

import java.util.ArrayList;

public class GrigliaManuale {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> griglia = new ArrayList<>();
		// questo for crea solo le righe del nostro array, non più di 3
		int valore = 1;
		for (int i = 0; i < 3; i++) {
			ArrayList<Integer> riga = new ArrayList<>();
			System.out.println(i);

			// questo for crea le colonne
			for (int j = 0; j < 3; j++) {
				riga.add(valore);
				valore++;//incremento il valore dei numeri
			}
			griglia.add(riga);//aggiunge le colonne a riga
		}System.out.println("ArrayList di ArrayList" + griglia);
		for(int i = 0; i < griglia.size(); i++) {
			for(int j = 0; j <griglia.get(i).size(); j++) {
				System.out.print(griglia.get(i).get(j) + " ");
			}System.out.println();
		}
	}

}
