package day_free1;
import java.sql.*;
//classe persona per inserire i dati estratti in oggetti
public class Persona {
	private int id;
	private String nome;
	private String cognome;
	private int età;
	
	public Persona(int id, String nome, String cognome, int età) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
	}

	public String toString() {
		return id + ";" + " " + nome + " " + cognome + ". età " + età;
	}
}
