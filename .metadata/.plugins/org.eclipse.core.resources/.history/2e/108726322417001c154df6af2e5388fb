package fr.eni.jpa.entity.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "TPCVoitureDeCourseEntity")
@Table(name = "TPCVoitureDeCourse")
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
