package day_02;
import java.util.Scanner;
public class AreaCerchio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci raggio per calcolare l' area");
		double raggio = scanner.nextDouble();
		double area = Math.PI * raggio * raggio;
		System.out.println("l' area è " + area);
		scanner.close();
		

	}

}
