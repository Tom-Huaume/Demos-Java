package fr.eni.spring;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument {
	
	@Override
	public void afficher() {
		System.out.println("Je suis un piano");
	}
	
	@Override
	public void jouer() {
		System.out.println("LA LA LA");
		
	}
}
