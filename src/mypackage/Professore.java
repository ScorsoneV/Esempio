package mypackage;

public class Professore extends Contatto {
	
	private String materia;
	
	public Professore() {
		// Questo è il costruttore di default
		// se usate questo per istanziare un oggetto le propietà avranno valore null
	}

	public Professore(String nome, String cognome, String materia) {
		//la parola chiave super richiama, se esiste(altrimenti segnala errore), il costruttore della super 
		//classe con lo stesso numero di parametri
		super(nome, cognome);
		this.materia=materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public void showDetails() {
		System.out.println("*** PROFESSORE ***");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Cognome: "+this.getCognome());
		System.out.println("Aula: "+ this.getMateria());
		System.out.println("******************");

	}

}
