package day_03;
import java.util.Scanner;
public class RestoDivisione {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci primo numero");
		int input1 = scanner.nextInt();
		System.out.println("inserisci secondo numero");
		int input2 = scanner.nextInt();
		
		int resto = input1 %input2 ;
		System.out.println(resto);
		scanner.close();
		

	}

}
