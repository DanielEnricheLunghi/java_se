package day_14.ereditarietà;

import java.time.LocalDate;

public class Persona {
	private String cf;
	private String nome;
	private String cognome;
	private LocalDate nascita;
	private String luogo;
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(String cf, String nome, String cognome, LocalDate nascita, String luogo) {
		super();
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
		this.luogo = luogo;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public LocalDate getNascita() {
		return nascita;
	}
	public void setNascita(LocalDate nascita) {
		this.nascita = nascita;
	}
	public String getLuogo() {
		return luogo;
	}
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}
	@Override
	public String toString() {
		return " cf=" + cf + ", nome=" + nome + ", cognome=" + cognome + ", nascita=" + nascita + ", luogo="
				+ luogo;
	}
	
	

}
