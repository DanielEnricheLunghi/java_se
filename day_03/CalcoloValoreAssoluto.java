package day_03;
import java.util.Scanner;
public class CalcoloValoreAssoluto {

	public static void main(String[] args) {
		
		System.out.println("inserisci numero per calcolare valore assoluto");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		int valoreAssoluto = Math.abs(numero);
		System.out.println(valoreAssoluto);
		scanner.close();
		

	}

}
