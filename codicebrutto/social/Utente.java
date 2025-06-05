package codicebrutto.social;

public class Utente {
	private String cf;
	private String nome;
	private String cognome;
	
	
    public Utente () {
    super();}
    public Utente (String cf, String nome, String cognome) {
    	this.cf = cf;
    	this.nome = nome;
    	this.cognome = cognome;
    	
    }
    public String getCf() {
    	return cf;
    	}
    public void setCf() {
    	this.cf = cf;
    }
    public String getNome() {
    	return nome;
        }
    public void setNome() {
    	this.nome = nome;
    }
    public String getCognome() {
    	return cognome;
        }
    public void setCognome() {
    	this.cognome = cognome;
    }
	//override
    public String toString() {
		return "Utente [cf = " + this.cf + ", nome = " + this.nome + ", cognome = " + this.cognome + "]";
	}
    
	

}
