package day_11;

import java.util.HashMap;
import java.util.Map;
public class Mappa {

	public static void main(String[] args) {
		Map<Integer, String> classificaF1 = new HashMap<>();
		classificaF1.put(1, "Verstappen");
		classificaF1.put(2, "Lecrec");
		classificaF1.put(3, "Hamilton");
		for(Map.Entry<Integer, String> entry: classificaF1.entrySet()) {
			System.out.println("classificato = " + entry.getKey() + " : " + entry.getValue());
		}
	}

}
