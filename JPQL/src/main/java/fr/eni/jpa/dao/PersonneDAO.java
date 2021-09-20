package fr.eni.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import fr.eni.jpa.entity.Personne;

public class PersonneDAO {
	
	public static List<Personne> findTous(){
		TypedQuery<Personne> query = DAOUtil.getEntityManager().createNamedQuery("findTous", Personne.class);
		return query.getResultList();
	}
	
	public static List<Personne> findNomCommencePar(String debut){
		TypedQuery<Personne> query = DAOUtil.getEntityManager().createNamedQuery("findNomCommencePar", Personne.class);
		return query.setParameter("var", debut + "%").getResultList();
	}
	
	public static List<Personne> findMessieurs(){
		TypedQuery<Personne> query = DAOUtil.getEntityManager().createNamedQuery("findMessieurs", Personne.class);
		return query.getResultList();
	}
	
	public void add (Personne p) throws Exception{
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		try {
			em.persist(p);
			et.commit();
		}catch(Exception e) {
			et.rollback();
			throw e;
		}
	}
	
	public void delete (Personne p) throws Exception{
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		try {
			em.remove(p);
			et.commit();
		}catch(Exception e) {
			et.rollback();
			throw e;
		}
	}
	
	public void update (Personne p) throws Exception{
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		try {
			em.merge(p);
			et.commit();
		}catch(Exception e) {
			et.rollback();
			throw e;
		}
	}
	
	public static void deleteAll() throws Exception{
		String req = "DELETE FROM Personne p";
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.createQuery(req).executeUpdate();
			et.commit();
		}catch (Exception e) {
			et.rollback();
			throw e;
		}
	}
	
	public static List<Personne> findAll(){
		String req = "SELECT Object(p) FROM Personne p";
		return DAOUtil.getEntityManager().createQuery(req, Personne.class).getResultList();
	}
	
}
