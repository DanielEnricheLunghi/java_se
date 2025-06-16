package day_free;
import java.util.ArrayList;
public class ListaDinamica {

	public static void main(String[] args) {
		double virgola = 230.32;
		ArrayList <Integer> numeri = new ArrayList<>();
		numeri.add(9);
		numeri.add(10);
		numeri.add(11 + 3);
		numeri.add((int) virgola );
		numeri.add((int) Math.PI);
		
		for(int i = 0; i < numeri.size(); i++) {
			System.out.println(i);
		}
		//modificare un valore scrivendo prima indice poi valore
		numeri.set(0, 999);
		//andiamo a prendere il valore del secondo indice
		numeri.get(1);
		//rimuovere valore
		numeri.remove(0);
		//pulire tutto l array
		numeri.clear();
		//rimuove valore 10 se esiste
		numeri.remove(Integer.valueOf(10));
		System.out.println(numeri);
		
		//questo è un array di array!!!
		ArrayList<ArrayList<String>> classi = new ArrayList();
		//questo ArrayList A che sara la prima lista 
		ArrayList<String> classeA = new ArrayList();
		classeA.add("Anna");
		classeA.add("Maria");
		classeA.add("Dario");
		//questa ArrayList B che sara la seconda lista 
		ArrayList<String> classeB = new ArrayList();
		classeB.add("Marco");
		classeB.add("Giocanni");
		classeB.add("Matteo");
		//aggiunta delle due liste al nostro ArrayList2D ma le liste possono essere infinite
		classi.add(classeA);
		classi.add(classeB);
		for(int i = 0; i < classi.size(); i++) {
			System.out.println();
		//il for con j serve ad accedere ai contenuti degli indici indicati da i	
			for(int j = 0; j < classi.get(i).size(); j++) {
				System.out.println(classi.get(i).get(j) + " ");
			}
		}
		System.out.println();
		System.out.println(classi.get(0).get(1));
		
		
	}

}
