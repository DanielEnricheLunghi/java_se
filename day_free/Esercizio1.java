package day_free;
import java.util.ArrayList;


//Crea una ArrayList<ArrayList<Integer>> che rappresenti una griglia 4x4 con i numeri da 1 a 16. 
public class Esercizio1 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> griglia = new ArrayList<>();
		int valore = 1;
		for(int i = 0; i < 4; i++) {
			ArrayList<Integer> riga = new ArrayList<>();
			//System.out.println(i);
		for(int j = 0; j < 4; j++ ) {
			riga.add(valore);
			valore++;
		}
		griglia.add(riga);
		}
		for(int i = 0; i < griglia.size(); i++) {
			for(int j = 0; j < griglia.get(i).size(); j++) {
				System.out.print(griglia.get(i).get(j) + " ");
			}System.out.println();
		}
	}

}
