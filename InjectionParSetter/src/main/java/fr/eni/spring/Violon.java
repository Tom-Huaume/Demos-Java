package fr.eni.spring;

public class Violon implements Instrument {
	
	@Override
	public void afficher() {
		System.out.println("Je suis un violon...");
	}
	
	@Override
	public void jouer() {
		System.out.println("ZIN ZIN ZIN");
	}
}
