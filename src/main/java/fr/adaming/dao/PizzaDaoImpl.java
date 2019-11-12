package fr.adaming.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import fr.adaming.entities.Pizza;
import fr.adaming.util.HibernateUtil;

public class PizzaDaoImpl implements IPizzaDao {
	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public void ajouterPizzaDao(Pizza piz1) {
		session.beginTransaction();
		session.save(piz1);
		session.getTransaction().commit();
	}

	@Override
	public List<Pizza> getAllPizzaDao() {
		List<Pizza>listPizza= new ArrayList<Pizza>();

		session.beginTransaction();
		listPizza = session.createQuery("from tb_pizza").list();
		session.getTransaction().commit();
		return listPizza;
	}

	@Override
	public void deletePizzaDao(long id) {
		session.beginTransaction();
		session.delete(session.get(Pizza.class, id));
		session.getTransaction().commit();
	}

	@Override
	public void updatePizza(Pizza piz1) {
		session.beginTransaction();
		session.merge(piz1);
		session.getTransaction().commit();
	}

}
