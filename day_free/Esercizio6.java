package day_free;

import java.util.ArrayList;

public class Esercizio6 {

	public static void main(String[] args) {
		ArrayList <Integer> numeri = new ArrayList<>();
		numeri.add(10);
		numeri.add(20);
		numeri.add(30);
		numeri.add(40);
		numeri.add(10);
		numeri.add(50);
		numeri.add(10);
		numeri.add(60);
		System.out.println(numeri);
		System.out.println(numeri.indexOf(10));
		System.out.println(numeri.lastIndexOf(10));
		numeri.remove(Integer.valueOf(10));
		System.out.println(numeri);
		int somma = 0;
		for(int numero : numeri) {
			somma += numero;
		}
		System.out.println(somma);
			
			
		

	}

}
