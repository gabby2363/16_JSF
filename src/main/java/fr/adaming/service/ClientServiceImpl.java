package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.ClientDaoImpl;
import fr.adaming.dao.IClientDao;
import fr.adaming.entities.Client;

public class ClientServiceImpl implements IClientService{
	
	IClientDao cDao = new ClientDaoImpl();

	@Override
	public void ajouterClientService(Client c1) {
		cDao.ajouterClientDao(c1);		
	}

	@Override
	public List<Client> getAllClientService() {
		return cDao.getAllClientDao();
	}

	@Override
	public void deleteClientService(long id) {
		cDao.deleteClientDao(id);		
	}

	@Override
	public Client getClientByIdService(long id) {
		return cDao.getClientByIdDao(id);
	}

	@Override
	public void updateClientService(Client c1) {
		cDao.updateClient(c1);		
	}

}
