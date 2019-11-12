package fr.adaming.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import fr.adaming.entities.Client;
import fr.adaming.util.HibernateUtil;

public class ClientDaoImpl implements IClientDao{
	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public void ajouterClientDao(Client c1) {
		session.beginTransaction();
		session.save(c1);
		session.getTransaction().commit();
	}

	@Override
	public List<Client> getAllClientDao() {
		List<Client>listClient= new ArrayList<Client>();

		session.beginTransaction();
		listClient = session.createQuery("from tb_client").list();
		session.getTransaction().commit();
		return listClient;
	}

	@Override
	public void deleteClientDao(long id) {
		session.beginTransaction();
		session.delete(session.get(Client.class, id));
		session.getTransaction().commit();
	}

	@Override
	public Client getClientByIdDao(long id) {
		session.beginTransaction();
		Client listClient = (Client) session.get(Client.class,id);
		session.getTransaction().commit();
		return listClient;
	}

	@Override
	public void updateClient(Client c1) {
		session.beginTransaction();
		session.merge(c1);
		session.getTransaction().commit();
	}

}
