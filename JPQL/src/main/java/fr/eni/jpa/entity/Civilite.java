package fr.eni.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CiviliteMTO")
public class Civilite {
	
	@Id
	private String cle;
	private String libelle;
	
	
	
	public Civilite() {
		super();
	}

	
	public Civilite(String cle, String libelle) {
		super();
		this.cle = cle;
		this.libelle = libelle;
	}


	public String getCle() {
		return cle;
	}



	public void setCle(String cle) {
		this.cle = cle;
	}



	public String getLibelle() {
		return libelle;
	}



	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	
}
