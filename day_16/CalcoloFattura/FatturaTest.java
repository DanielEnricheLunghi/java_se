package day_16.CalcoloFattura;
import day_16.CalcoloFattura.ClienteGas;


import java.math.BigDecimal;

public class FatturaTest {

	public static void main(String[] args) {
		
//		//creazione oggetto con get e set
		//Cliente paoloRossi1 = new Cliente();
//		System.out.println(paoloRossi.toString());
//		paoloRossi.setCf("cf1");
//		paoloRossi.setNome("Paolo");
//		paoloRossi.setCognome("Rossi");
//		paoloRossi.setPrezzoDaPagare(new BigDecimal ("1200.00"));
//		System.out.println(paoloRossi.toString());
//		
//		//Creazione oggetto con costruttore parametrico
//		Cliente lucaVerdi = new Cliente("cf2" , "Luca" , "Verdi" , new BigDecimal("1200.00"));
//		System.out.println(lucaVerdi.toString());
	
		//costruttore default
		ClienteLuce paoloRossi = new ClienteLuce();
		paoloRossi.setCf("cf1");
		paoloRossi.setNome("Paolo");
		paoloRossi.setCognome("Rossi");
		paoloRossi.setKwh(30.00);
		
		//costruttore parametrico
		ClienteLuce lucaVerdi = new ClienteLuce("cf2" , "Luca" , "Verdi" , 80.00);
		
		//viene richiamato toString
		System.out.println(lucaVerdi);
		System.out.println(paoloRossi);
		
		ClienteGas gianniBianchi = new ClienteGas("cf3" , "Gianni" , "Bianchi" , 50.00);
		System.out.println(gianniBianchi);
		ClienteFisso mariaNeri = new ClienteFisso( "cf3","maria","neri",ContrattoFisso.SPECIAL );
		
		System.out.println(mariaNeri.toString());
		
        // 1) Creo un cliente luce
        ClienteLuce clienteLuce = new ClienteLuce("cf123", "Mario", "Rossi", 250);

        // 2) Chiamo il calcolo della fattura
        FatturaController.calcoloFattura(clienteLuce);

        // 3) Stampo il risultato
        System.out.println("Cliente: " + clienteLuce.getNome() + " " + clienteLuce.getCognome());
        System.out.println("kWh consumati: " + clienteLuce.getKwh());
        System.out.println("Prezzo per kWh: " + clienteLuce.getPrezzoKwh());
        System.out.println("Prezzo totale da pagare: " + clienteLuce.getPrezzoDaPagare());
        FatturaController.calcoloFattura(gianniBianchi);
        System.out.println(gianniBianchi.toString());
		
     
	}
	
	
	

}
