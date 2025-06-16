package day_11;
import java.util.List;
//questo è l' esercizio del giardino bambini piante che gpt ha risolto solo con il for
public class EsercizioPB {
    public static void main(String[] args) {
        String fila1 = "VVRRGGCC";
        String fila2 = "GGCCVVGG";

        List<String> bambini = List.of("Alice", "Bob", "Charlie", "David");

        // Prima riga: piante di fila1 per ogni finestra
        System.out.print("Finestra 1\tFinestra 2\tFinestra 3\tFinestra 4\n");

        // Riga 1 → piante della prima fila
        for (int i = 0; i < bambini.size(); i++) {
            int pos = 2 * i;
            System.out.print("" + fila1.charAt(pos) + fila1.charAt(pos + 1) + "\t\t");
        }

        System.out.println();

        // Riga 2 → piante della seconda fila
        for (int i = 0; i < bambini.size(); i++) {
            int pos = 2 * i;
            System.out.print("" + fila2.charAt(pos) + fila2.charAt(pos + 1) + "\t\t");
        }

        System.out.println();
    }
}



