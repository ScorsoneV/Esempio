package mypackage;

public class Test {

	public static void main(String[] args) {
		Contatto[] rubrica = new Contatto[4];
		
		//Il primo elemento della rubrica lo creo con un costruttore di default 
		// e setto le proprietà dopo averlo istanziato
		Contatto primo= new Professore();
		primo.setNome("prof");
		primo.setCognome("n.1");
		//L'operazione fatta nel parentesi si chiama cast, cioè conversione, la faccio perchè essendo
		// primo un riferimento a Contatto non ha la visibilità del metodo setMateria. In questo
		// caso il cast è sicuro, ma bisogna stare attenti a come lo si utilizza perchè è facile
		// incorrere in eccezioni
		((Professore)primo).setMateria("esempio1");
		rubrica[0]=primo;
		
		Contatto secondo= new Alunno("Alunno", "n.2", "esempio2");
		rubrica[1]=secondo;
		
		Contatto terzo= new Alunno("Alunno", "n.3", "esempio3");
		rubrica[2]=terzo;
		
		Contatto quarto= new Professore("Professore", "n.4", "esempio4");
		rubrica[3]=quarto;
		
		//In questo for è possibile vedere il vantaggio del polimorfismo, viene chiamato il metodo
		// showDetails per ogni elemento dell'array, ma non siete voi a dovervi preoccupare di quale 
		// metodo chiamare, ma verrò chiamato automaticamente quello corretto a runTime
		for(int i=0; i<rubrica.length; ++i) {
			rubrica[i].showDetails();
			System.out.println("\n\n");
		}
	}

}
