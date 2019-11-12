package fr.adaming.service;

import java.util.List;

import fr.adaming.entities.Client;

public interface IClientService {
	public void ajouterClientService(Client c1);

	public List<Client> getAllClientService();

	public void deleteClientService(long id);

	public Client getClientByIdService(long id);

	public void updateClientService(Client c1);
}
