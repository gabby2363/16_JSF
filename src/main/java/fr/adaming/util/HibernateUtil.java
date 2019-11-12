package fr.adaming.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try{
			//création du SessionFactory
			return new Configuration().configure().buildSessionFactory();
		}catch(Throwable ex){
			System.err.println("Erreur d'iniatilisation de session factory"+ ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
