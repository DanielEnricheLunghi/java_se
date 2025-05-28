package day_03;
import java.util.Scanner;
public class AreaTrapezio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci base1");
		int base1 = scanner.nextInt();
		System.out.println("inserisci base2");
		int base2 = scanner.nextInt();
		System.out.println("inserisci altezza");
		int altezza = scanner.nextInt();
		
		int area = ((base1 + base2) * altezza) / 2;
		System.out.println("l' area è " + area);
		scanner.close();
		

	}

}
