package fr.adaming.service;

import java.util.List;

import fr.adaming.entities.Pizza;

public interface IPizzaService {
	public void ajouterPizzaService(Pizza piz1);

	public List<Pizza> getAllPizzaService();

	public void deletePizzaService(long id);

	public void updatePizzaService(Pizza piz1);
}
