package fr.eni.spring;

import org.springframework.stereotype.Component;

@Component
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
