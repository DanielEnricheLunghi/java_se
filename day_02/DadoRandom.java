package day_02;

//import java.util.Random;
import java.util.Scanner;

public class DadoRandom {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//Random random = new Random();
		System.out.println("-----BENVENUTO AI DADI-----");
		System.out.println("lancia il dado premendo invio");

		while (true) {
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				System.out.println("Gioco terminato.");
				break;
			}
			int numeroRandom1 = (int) (Math.random() * 6 + 1);
			if (input.isEmpty()) {
				System.out.println("è uscito il numero " + numeroRandom1 + "\n");
			}

			System.out.println("tocca a me \n");
			int numeroRandom2 = (int) (Math.random() * 6 + 1);
			System.out.println("è uscito il numero " + numeroRandom2 + "\n");

			if (numeroRandom1 > numeroRandom2) {
				System.out.println("Hai vinto 1000000 di euro");
			} else if (numeroRandom2 > numeroRandom1) {
				System.out.println("Il banco vince");
			} else {
				System.out.println("patta dobbiamo rilanciare");

			}
			System.out.println("Premi INVIO per rilanciare o digita qualsiasi cosa per uscire.");
		}

		scanner.close();

	}

}
