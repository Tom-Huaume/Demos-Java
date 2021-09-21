package fr.eni.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="mus")
public class Musicien {
	
	private String morceau;
	
	@Autowired(required=false)
	@Qualifier("piano")
	private Instrument instrument;
	
	public Musicien() {
		this.morceau = "Bolero de Ravel";
	}

	public Musicien(String morceau, Instrument instrument) {
		this.morceau = morceau;
		this.instrument = instrument;
	}

	public String getMorceau() {
		return morceau;
	}

	public void setMorceau(String morceau) {
		this.morceau = morceau;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public void jouerMorceau() {
		instrument.afficher();
		System.out.println("et je joue le morceau " + morceau);
		instrument.jouer();
	}

}
