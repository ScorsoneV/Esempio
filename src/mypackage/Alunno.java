package mypackage;

public class Alunno extends Contatto{
	
	private String aula;

	public Alunno() {
		// Questo è il costruttore di default
		// se usate questo per istanziare un oggetto le propietà avranno valore null
	}

	public Alunno(String nome, String cognome, String aula) {
		//la parola chiave super richiama, se esiste(altrimenti segnala errore), il costruttore della super 
		//classe con lo stesso numero di parametri
		super(nome, cognome);
		this.aula=aula;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	@Override
	public void showDetails() {
		System.out.println("*** ALUNNO ***");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Cognome: "+this.getCognome());
		System.out.println("Aula: "+ this.getAula());
		System.out.println("**************");
	}

}
