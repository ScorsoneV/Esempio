package mypackage;

public abstract class Contatto {
	
	private String nome;
	private String cognome;
	
	public Contatto() {
		// Questo è il costruttore di default
		// se usate questo per istanziare un oggetto le propietà avranno valore null
	}

	public Contatto(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
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
	
	public abstract void showDetails();
	
}
