package fr.eni.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity 
public class Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "NOM", nullable = false, length = 50)
	private String nom; 
	
	@Column(name = "PRENOM", nullable = false, length = 50)
	private String prenom;
	
	@Column(name = "DATE_NAISSANCE", nullable = true)
	@Temporal(TemporalType.DATE)
	private Calendar dateNaissance;
	
	@Transient
	private int age;
	
	public Personne() {
		super();
	}

	public Personne(String nom, String prenom, Calendar dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
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

	public Calendar getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Calendar dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Personne [id=" + id + ", login=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]"; 
	}
	
	
}
