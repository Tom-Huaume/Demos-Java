package fr.eni.jpa.entity.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "C")
public class VoitureDeCourse extends Voiture {
	
	private String ecurie;
	
	public VoitureDeCourse() {
		super();
	}

	public VoitureDeCourse(String marque, String ecurie) {
		super(marque);
		this.ecurie = ecurie;
	}

	public String getEcurie() {
		return ecurie;
	}

	public void setEcurie(String ecurie) {
		this.ecurie = ecurie;
	}
	
}
