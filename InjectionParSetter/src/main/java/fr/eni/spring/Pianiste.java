package fr.eni.spring;

public class Pianiste {
	private Piano piano;
	private String morceau;
	
	public Pianiste() {
		super();
	}

	public Pianiste(String morceau) {
		this.morceau = morceau;
		piano = new Piano();
		
	}
	
	public void jouerMorceau() {
		piano.afficher();
		System.out.println("et je jour le morceau "+ morceau);
		piano.jouer();
	}
}
