package fr.eni.spring;

public class Musicien {
	
	private String morceau;
	private Instrument instrument;
	
	public Musicien() {
		super();
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
