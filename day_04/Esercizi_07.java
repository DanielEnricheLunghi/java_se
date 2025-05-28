package day_04;

public class Esercizi_07 {

	public static void main(String[] args) {
		int[] numeri = {70, 20, 30, 40 ,50};
		int min = numeri[0];
		int max = numeri[0];
		for(int numero : numeri) {
			if(numero < min) {
				min = numero;
			}if(numero > max) {
				max = numero;
			}
			
		}System.out.println("numero min = " + min + " numero max = " + max);

	}

}
