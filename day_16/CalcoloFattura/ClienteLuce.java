package day_16.CalcoloFattura;

import java.math.BigDecimal;

public class ClienteLuce extends Cliente {
	
	private double kwh;// consumo kwh
	private BigDecimal prezzoKwh;// prezzo impostato kwh
	
	public ClienteLuce() {
		//viene richiamato il cotruttore di default della classe cliente
		super();
	}

	public ClienteLuce(String cf, String nome, String cognome, double kwh) {
		//costruttore parametrico
		super(cf, nome, cognome);
		this.kwh = kwh;
	
		
	}

	public double getKwh() {
		return kwh;
	}

	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

	public BigDecimal getPrezzoKwh() {
		return prezzoKwh;
	}

	public void setPrezzoKwh(BigDecimal prezzoKwh) {
		this.prezzoKwh = prezzoKwh;
	}

	@Override
	public String toString() {
		
		return "ClientiLuce  [" + super.toString() + " kwh=" + kwh + ", prezzoKwh=" + prezzoKwh + "]";
	}
	
	
	
	
}


