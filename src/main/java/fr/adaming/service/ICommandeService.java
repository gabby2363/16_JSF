package fr.adaming.service;

import java.util.List;

import fr.adaming.entities.Commande;

public interface ICommandeService {
	public void ajouterCommandeService(Commande c1);

	public List<Commande> getAllCommandeService();

	public void deleteCommandeService(long id);

	public Commande getCommandeByIdService(long id);

	public void updateCommandeService(Commande c1);

}
