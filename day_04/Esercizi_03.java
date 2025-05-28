package day_04;

public class Esercizi_03 {

	public static void main(String[] args) {
		
		String stringa = "anna";
		String stringaContrario = "";
		for(int i = stringa.length() -1; i >= 0; i--) {
			//char lettera = stringa.charAt(i);
			stringaContrario += stringa.charAt(i);
		}
		if(stringa.equals(stringaContrario)) {
			System.out.println("stringa è palindromo");
		}else {System.out.println("stringa non è palindromo");}
		

	}

}
