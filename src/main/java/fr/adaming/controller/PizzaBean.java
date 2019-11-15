package fr.adaming.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import fr.adaming.entities.Pizza;
import fr.adaming.service.IPizzaService;
import fr.adaming.service.PizzaServiceImpl;

@ManagedBean(name="pizzaBean")
@SessionScoped
public class PizzaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Pizza pizza = new Pizza();
	IPizzaService piz=new PizzaServiceImpl();
	List<Pizza>listPizza =new ArrayList<>();

	public List<Pizza> getListPizza() {
		return listPizza;
	}

	
	public Pizza getPizza() {
		return pizza;
	}


	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}


	public void setListPizza(List<Pizza> listPizza) {
		this.listPizza = listPizza;
	}

	@PostConstruct
	public void init(){
		listPizza=piz.getAllPizzaService();
	}

	public String ajouterPizza(){
		piz.ajouterPizzaService(pizza);
		init();
		return "listPizza.xhtml" ;
	}
	
	public String supprimerPizza(long id){
		piz.deletePizzaService(id);
		init();
		return "liste";
	}
	
	public String modifierPizza(long id){
		pizza = piz.getPizzaById(id);
		return "formulairePizza.xhtml";
	}
	
	public String updatePizza(){
		piz.updatePizzaService(pizza);
		init();
		return "listPizza.xhtml";
	}
	
	public String goAjoutPizza(){
		pizza = new Pizza();
		
		System.out.println(pizza);
		
		return "formulairePizza.xhtml";
	}
	
	public String goListPizza(){
		init();
		return "listPizza.xhtml";
	}
}
