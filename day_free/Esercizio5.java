package day_free;
import java.util.ArrayList;
public class Esercizio5 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>(); 
		lista.add("Anna");
		lista.add("Luca");
		lista.add("Marco");
		lista.add("Anna");
		lista.add("Giorgio");
		lista.add("Anna");
		lista.add("Mario");
		lista.add("Elena");
		
		System.out.println(lista.indexOf("Anna"));
		System.out.println(lista.lastIndexOf("Anna"));
		if(lista.contains("Paolo")) {
			System.out.println("trovato");
		}else {System.out.println("non trovato " + lista.indexOf("Paolo"));}
		
	}

}
