package fr.eni.jpa.main;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.eni.jpa.entity.Personne;
import fr.eni.jpa.entity.User;

public class TestUser {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		System.out.println("test");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mysql_UP");
		EntityManager em = emf.createEntityManager();
		
		User u1 = new User(1, "java", "avance");
		Personne p1 = new Personne("Thomas", "Huaume", new GregorianCalendar(2000, 05, 22));
		
		em.getTransaction().begin();
		try {
			em.persist(u1);
			em.persist(p1);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		
		System.out.println(p1);
		
		String requete = "from User u";
		List<User> listeU = em.createQuery(requete).getResultList();
		
		System.out.println("Liste des user :");
		for(User user : listeU) {
			System.out.println(user);
		}
		em.close();
		emf.close();

	}

}