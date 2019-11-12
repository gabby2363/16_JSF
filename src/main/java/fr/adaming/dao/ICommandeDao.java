package fr.adaming.dao;

import java.util.List;

import fr.adaming.entities.Commande;


public interface ICommandeDao {
	public void ajouterCommandeDao(Commande c1);

	public List<Commande> getAllCommandeDao();

	public void deleteCommandeDao(long id);

	public Commande getCommandeByIdDao(long id);

	public void updateCommande(Commande c1);

}
