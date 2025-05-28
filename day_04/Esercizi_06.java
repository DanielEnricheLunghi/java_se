package day_04;

public class Esercizi_06 {

	public static void main(String[] args) {
		
		double totale = 0;
		double[] numeri = {10.56, 20.325 ,30.5345 ,40, 50};
		for(double numero : numeri) {
			totale += numero;
			
		}
		double media = totale / numeri.length;
		System.out.println(media);
		

	}

}
