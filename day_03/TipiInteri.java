package day_03;

public class TipiInteri {

	public static void main(String[] args) {
		
		byte numeroByte = 122; // 1111010
		short numeroShort = numeroByte; // 00000000 1111010
		int numeroIntero = numeroShort; // 00000000 00000000 00000000 1111010
		long numeroLong = numeroIntero; // 00000000 00000000 00000000 00000000 00000000 00000000 00000000 1111010 
		float numeroFloat = numeroIntero;
		double numeroDouble = numeroFloat;
		System.out.println(numeroDouble);

	}

}
