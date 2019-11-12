package fr.adaming.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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

	IPizzaService piz=new PizzaServiceImpl();
	List<Pizza>listPizza =new ArrayList<>();

	public List<Pizza> getListPizza() {
		return listPizza;
	}

	public void setListPizza(List<Pizza> listPizza) {
		this.listPizza = listPizza;
	}

	@PostConstruct
	public void init(){
		listPizza=piz.getAllPizzaService();
	}

	public boolean filterByPrice(Object value, Object filter, Locale locale) {
		String filterText = (filter == null) ? null : filter.toString().trim();
		if(filterText == null||filterText.equals("")) {
			return true;
		}

		if(value == null) {
			return false;
		}

		return ((Comparable) value).compareTo(Integer.valueOf(filterText)) > 0;
	}
}
