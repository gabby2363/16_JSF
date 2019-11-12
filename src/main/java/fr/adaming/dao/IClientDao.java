package fr.adaming.dao;

import java.util.List;

import fr.adaming.entities.Client;

public interface IClientDao {

	public void ajouterClientDao(Client c1);

	public List<Client> getAllClientDao();

	public void deleteClientDao(long id);

	public Client getClientByIdDao(long id);

	public void updateClient(Client c1);
}
