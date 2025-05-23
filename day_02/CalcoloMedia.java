package day_02;
import java.util.Scanner;
public class CalcoloMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci primo numero");
		int input1 = scanner.nextInt();
		System.out.println("inserisci secondo numero");
		int input2 = scanner.nextInt();
		System.out.println("inserisci terzo numero");
		int input3 = scanner.nextInt();
		int media = input1 + input2 + input3;
		System.out.println("la media dei tre numeri è" + media);
		

	}

}
