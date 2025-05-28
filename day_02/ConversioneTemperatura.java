package day_02;
import java.util.Scanner;
public class ConversioneTemperatura {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci temperatura");
		double input = scanner.nextDouble();
		double fahrenheit = input * 9.0 / 5.0 + 32;
		System.out.println("la temperatura in farenheit è " + fahrenheit);
		scanner.close();
		
	}

}
