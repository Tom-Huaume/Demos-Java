package fr.eni.jpa.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.jpa.dao.DAOUtil;
import fr.eni.jpa.entity.tableperclass.Berline;
import fr.eni.jpa.entity.tableperclass.Voiture;
import fr.eni.jpa.entity.tableperclass.VoitureDeCourse;
public class MainTablePerClass {

	public static void main(String[] args) {


		Voiture v1 = new Voiture("Renault Clio");
		Berline b1 = new Berline("BMW", "Rouge");
		VoitureDeCourse c1 = new VoitureDeCourse("Ferrari", "Scuderia Ferrari");
		
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(v1);
			em.persist(b1);
			em.persist(c1);
			et.commit();
		}catch(Exception e) {
			et.rollback();
			e.printStackTrace();
		}
		
		List<Voiture> liste = null;
		
		liste = em.createQuery("SELECT Object(v) from TPCVoitureDeCourseEntity v", Voiture.class).getResultList();
		System.out.println("\nListe des voitures de courses : ");
		for(Voiture voiture : liste) {
			System.out.println(voiture);
		}
		
		liste = em.createQuery("SELECT Object(v) from TPCBerlineEntity v", Voiture.class).getResultList();
		System.out.println("\nListe des berliness : ");
		for(Voiture voiture : liste) {
			System.out.println(voiture);
		}
		
		liste = em.createQuery("SELECT Object(v) from TPCVoitureEntity v", Voiture.class).getResultList();
		System.out.println("\nListe des voitures (toutes) : ");
		for(Voiture voiture : liste) {
			System.out.println(voiture);
		}
		
		DAOUtil.close();

	}

}
