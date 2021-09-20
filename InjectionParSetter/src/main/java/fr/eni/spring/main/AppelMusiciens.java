package fr.eni.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.spring.Musicien;

public class AppelMusiciens {

	public static void main(String[] args) {


		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Musicien musicien1 = context.getBean("musicien", Musicien.class);
		musicien1.jouerMorceau();
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
