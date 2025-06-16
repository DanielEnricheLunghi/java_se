package day_free;

import java.util.ArrayList;

public class Esercizio3 {

	public static void main(String[] args) {
		ArrayList<String> vipStringati = new ArrayList<>();
		vipStringati.add("Albano");
		vipStringati.add("Mara");
		vipStringati.add("Simona");
		vipStringati.add("Luca");
		vipStringati.add("Giorgia");
		
		System.out.println(vipStringati);
		System.out.println();
		vipStringati.remove("Luca");
		vipStringati.set(2, "Simone");
		for(String vip : vipStringati)
		if(vip.contains("o")) {
			System.out.println(vip);
			
		}
		System.out.println();
		String trovato = "";
		for(String vip : vipStringati) {
			if(vip.equals("Giorgia")) {
				trovato = vip;
				System.out.println("utente trovato " + vip);
			}
		}
		System.out.println(vipStringati.size());
		
	}

}
