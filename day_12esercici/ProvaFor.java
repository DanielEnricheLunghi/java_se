package day_12esercici;

public class ProvaFor {

	public static void main(String[] args) {
		String stringa = "12345";
		int span = 2;
		String serie = "";
		for(int i = 0; i < stringa.length() - span; i++) {
			serie = stringa.substring(i, i + span);
			System.out.println(serie);
		}

	}

}
