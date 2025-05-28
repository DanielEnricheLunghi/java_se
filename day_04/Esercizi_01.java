package day_04;
import java.util.Scanner;
public class Esercizi_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci una frase");
		String frase = scanner.nextLine();
		int numeroParole = 0;
		boolean dentroParola = false;
		for(int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if(!Character.isWhitespace(c)) {
				if(!dentroParola) {
					numeroParole++;
					dentroParola = true;
				}
			}else {
				dentroParola = false;
			}
		}System.out.println("numero parole " + numeroParole);
		scanner.close();
		

	}

}
