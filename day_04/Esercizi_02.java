package day_04;

public class Esercizi_02 {

	public static void main(String[] args) {
		String stringa  = "daksjks";
		char letteraInput = 'a';
		int contatoreLettera = 0;
		for(int i = 0; i < stringa.length(); i++) {
			char lettera = stringa.charAt(i);
			if(lettera == letteraInput) {
				
				contatoreLettera++;
				
			}
		}System.out.println(contatoreLettera);

	}

}
