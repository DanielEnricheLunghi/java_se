package codicebrutto;

public class Metodo {
	
	public String parolaPiuLunga (String [] stringhe) {
		String parola = "";
		for(int i = 0; i < stringhe.length; i++) {
			if(stringhe[i].length() > parola.length()) {
				parola = stringhe[i] + " ";
			}
		}return parola;
		
	}
	


}
