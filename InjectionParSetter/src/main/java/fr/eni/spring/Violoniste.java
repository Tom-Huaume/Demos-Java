package fr.eni.spring;

public class Violoniste {
	private Violon violon;
	private String morceau;
	
	public Violoniste() {
		super();
	}

	public Violoniste(String morceau) {
		this.morceau = morceau;
		violon = new Violon();
	}
	
	public void jouerMorceau() {
		violon.afficher();
		System.out.println("et je joue le morceau " + morceau);
		violon.jouer();
	}
}
