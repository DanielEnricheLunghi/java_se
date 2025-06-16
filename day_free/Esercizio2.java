package day_free;
import java.util.ArrayList;
public class Esercizio2 {

	public static void main(String[] args) {
		ArrayList<String> vipStringati = new ArrayList<>();
		vipStringati.add("Albano");
		vipStringati.add("Mara");
		vipStringati.add("Simona");
		for(String vip : vipStringati) {
			System.out.println(vip);
		}
		vipStringati.remove("Mara");
		for(String vip : vipStringati) {
			System.out.println(vip);
		}
		vipStringati.add("Mara");
		System.out.println();
		
		for(String vip : vipStringati) {
			if(vip.toLowerCase().contains("a")) {
				System.out.println(vip);
			}
		}
		System.out.println();
		vipStringati.set(2, "Simone");
		//vipStringati.add("Mara");
		if(vipStringati.contains("Mara")) {
			System.out.println("trovato");
		}else {
			System.out.println("non trovato");
		}
		
	}
	

}
