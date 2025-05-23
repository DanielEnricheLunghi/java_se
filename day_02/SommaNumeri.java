package day_02;

import java.util.Scanner;

public class SommaNumeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci primo numero");
		int numero1 = scanner.nextInt();
		System.out.println("inserisci secondo numero");
		int numero2 = scanner.nextInt();
		int somma = numero1 + numero2;
		System.out.println("la somma è " + somma);
		
		

	}

}
