package day_14.ereditarietà;

import java.time.LocalDate;

public class Uomo extends Persona{
	private boolean abbonamentoStadio;

	public Uomo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Uomo(String cf, String nome, String cognome, LocalDate nascita, String luogo, boolean abbonamentoStadio) {
		super(cf, nome, cognome, nascita, luogo);
		this.abbonamentoStadio = abbonamentoStadio;
	}

	public boolean isAbbonamentoStadio() {
		return abbonamentoStadio;
	}

	public void setAbbonamentoStadio(boolean abbonamentoStadio) {
		this.abbonamentoStadio = abbonamentoStadio;
	}

	@Override
	public String toString() {
		return "Uomo [ " + super.toString() + "abbonamentoStadio = " + abbonamentoStadio + "]";
	}
	
	

}
