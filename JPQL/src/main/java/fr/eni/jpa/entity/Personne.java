package fr.eni.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "PersonneMTO")
@NamedQueries({
	@NamedQuery(name = "findTous",
			query = "SELECT p FROM Personne p"),
	
	@NamedQuery(name = "findNomCommencePar",
			query = "SELECT p FROM Personne p WHERE p.nom LIKE :var"),
	
	@NamedQuery(name = "findMessieurs",
			query = "SELECT p FROM Personne p WHERE p.civilite.cle = 'M'")
	
})
public class Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	
	@ManyToOne
	private Civilite civilite;

	public Personne() {
	}

	public Personne(String nom, String prenom, Civilite civilite) {
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
	
	
	
}
