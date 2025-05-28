package day_02;

import java.util.Scanner;

public class AreaRettangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci larghezza");
		double base = scanner.nextDouble();
		System.out.println("inserisci altezza");
		double altezza = scanner.nextDouble();
		double area = base * altezza;
		System.out.println("area è " + area);
		scanner.close();
	}

}
