package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.CommandeDaoImpl;
import fr.adaming.dao.ICommandeDao;
import fr.adaming.entities.Commande;


public class CommandeServiceImpl implements ICommandeService {
	ICommandeDao cDao = new CommandeDaoImpl();
	
	@Override
	public void ajouterCommandeService(Commande c1) {
		cDao.ajouterCommandeDao(c1);		
	}

	@Override
	public List<Commande> getAllCommandeService() {
		return cDao.getAllCommandeDao();
	}

	@Override
	public void deleteCommandeService(long id) {
		cDao.deleteCommandeDao(id);		
	}

	@Override
	public Commande getCommandeByIdService(long id) {
		return cDao.getCommandeByIdDao(id);
	}

	@Override
	public void updateCommandeService(Commande c1) {
		cDao.updateCommande(c1);		
	}
}
