package fr.eni.jpa.entity.tableperclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="TPCVoitureEntity")
@Table(name="TPCVoiture")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Voiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String marque;
	
	public Voiture() {
	}

	public Voiture(String marque) {
		this.marque = marque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Voiture [id=" + id + ", marque=" + marque + "]";
	}
	
	
	
}
