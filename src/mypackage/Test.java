package mypackage;

public class Test {

	public static void main(String[] args) {
		Contatto[] rubrica = new Contatto[4];
		
		//Il primo elemento della rubrica lo creo con un costruttore di default 
		// e setto le propriet� dopo averlo istanziato
		Contatto primo= new Professore();
		primo.setNome("prof");
		primo.setCognome("n.1");
		//L'operazione fatta nel parentesi si chiama cast, cio� conversione, la faccio perch� essendo
		// primo un riferimento a Contatto non ha la visibilit� del metodo setMateria. In questo
		// caso il cast � sicuro, ma bisogna stare attenti a come lo si utilizza perch� � facile
		// incorrere in eccezioni
		((Professore)primo).setMateria("esempio1");
		rubrica[0]=primo;
		
		Contatto secondo= new Alunno("Alunno", "n.2", "esempio2");
		rubrica[1]=secondo;
		
		Contatto terzo= new Alunno("Alunno", "n.3", "esempio3");
		rubrica[2]=terzo;
		
		Contatto quarto= new Professore("Professore", "n.4", "esempio4");
		rubrica[3]=quarto;
		
		//In questo for � possibile vedere il vantaggio del polimorfismo, viene chiamato il metodo
		// showDetails per ogni elemento dell'array, ma non siete voi a dovervi preoccupare di quale 
		// metodo chiamare, ma verr� chiamato automaticamente quello corretto a runTime
		for(int i=0; i<rubrica.length; ++i) {
			rubrica[i].showDetails();
			System.out.println("\n\n");
		}
	}

}
