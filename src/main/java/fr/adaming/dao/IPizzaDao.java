package fr.adaming.dao;

import java.util.List;

import fr.adaming.entities.Pizza;


public interface IPizzaDao {
	public void ajouterPizzaDao(Pizza piz1);
	
	public List<Pizza> getAllPizzaDao();
	
	public void deletePizzaDao(long id);
	
	public void updatePizza(Pizza piz1);
}
