package day_free;

public class Esercizio7Metodi {

	public static void main(String[] args) {
		MetodoAcqua bere = new MetodoAcqua();
		int bicchiere = 1;
		int acquaBottiglia = 10;
		bere.beviAcqua(bicchiere, acquaBottiglia);
		int acquaRestante = bere.beviAcqua(acquaBottiglia, bicchiere);
		System.out.println(acquaRestante);
		

	}

}
