package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.IPizzaDao;
import fr.adaming.dao.PizzaDaoImpl;
import fr.adaming.entities.Pizza;

public class PizzaServiceImpl implements IPizzaService{
	
	IPizzaDao pDao = new PizzaDaoImpl();

	@Override
	public void ajouterPizzaService(Pizza piz1) {
		pDao.ajouterPizzaDao(piz1);		
	}

	@Override
	public List<Pizza> getAllPizzaService() {
		return pDao.getAllPizzaDao();
	}

	@Override
	public void deletePizzaService(long id) {
		pDao.deletePizzaDao(id);
	}

	@Override
	public void updatePizzaService(Pizza piz1) {
		pDao.updatePizza(piz1);
	}

	@Override
	public Pizza getPizzaById(long id) {
		return pDao.getPiizzaById(id);
	}

}
