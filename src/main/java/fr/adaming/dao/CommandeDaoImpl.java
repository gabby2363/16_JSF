package fr.adaming.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import fr.adaming.entities.Commande;
import fr.adaming.util.HibernateUtil;

public class CommandeDaoImpl implements ICommandeDao {
	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public void ajouterCommandeDao(Commande c1) {
		session.beginTransaction();
		session.save(c1);
		session.getTransaction().commit();
	}

	@Override
	public List<Commande> getAllCommandeDao() {
		List<Commande>listCommande= new ArrayList<Commande>();

		session.beginTransaction();
		listCommande = session.createQuery("from tb_commande").list();
		session.getTransaction().commit();
		return listCommande;
	}

	@Override
	public void deleteCommandeDao(long id) {
		session.beginTransaction();
		session.delete(session.get(Commande.class, id));
		session.getTransaction().commit();
	}

	@Override
	public Commande getCommandeByIdDao(long id) {
		session.beginTransaction();
		Commande commande = (Commande) session.get(Commande.class,id);
		session.getTransaction().commit();
		return commande;
	}

	@Override
	public void updateCommande(Commande c1) {
		session.beginTransaction();
		session.merge(c1);
		session.getTransaction().commit();
	}
}
