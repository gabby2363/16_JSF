package fr.adaming.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.adaming.entities.Client;
import fr.adaming.entities.Commande;
import fr.adaming.entities.Pizza;
import fr.adaming.service.ClientServiceImpl;
import fr.adaming.service.CommandeServiceImpl;
import fr.adaming.service.IClientService;
import fr.adaming.service.ICommandeService;
import fr.adaming.service.IPizzaService;
import fr.adaming.service.PizzaServiceImpl;

@ManagedBean(name="commandeBean")
@SessionScoped
public class CommandeBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ICommandeService comServ= new CommandeServiceImpl();
	Commande com =new Commande();
	List<Commande> listCommande = new ArrayList<>();
	Client client = new Client();
	Pizza pizza = new Pizza();
	List<Pizza>listPizza =new ArrayList<>();
	IPizzaService piz=new PizzaServiceImpl();
	List<Client>listClient =new ArrayList<>();
	IClientService cli=new ClientServiceImpl();
	long selectedPizza;
	long selectedClient;
	
	
	public long getSelectedPizza() {
		return selectedPizza;
	}
	public void setSelectedPizza(long selectedPizza) {
		this.selectedPizza = selectedPizza;
	}
	public long getSelectedClient() {
		return selectedClient;
	}
	public void setSelectedClient(long selectedClient) {
		this.selectedClient = selectedClient;
	}
	public List<Client> getListClient() {
		return listClient;
	}
	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}
	public List<Pizza> getListPizza() {
		return listPizza;
	}
	public void setListPizza(List<Pizza> listPizza) {
		this.listPizza = listPizza;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	public Commande getCom() {
		return com;
	}
	public void setCom(Commande com) {
		this.com = com;
	}
	public List<Commande> getListCommande() {
		return listCommande;
	}
	public void setListCommande(List<Commande> listCommande) {
		this.listCommande = listCommande;
	}
	
	@PostConstruct	
	public void init(){
		listCommande=comServ.getAllCommandeService();
		listPizza=piz.getAllPizzaService();
		listClient=cli.getAllClientService();
		
	}
	
	public String afficherListCommande(){
		init();
		return "listCommande.xhtml";
	}
	
	public String ajouterCommande(){
		client = cli.getClientByIdService(selectedClient);
		pizza  = piz.getPizzaById(selectedPizza);
		com.setClient(client);
		com.setPiz(pizza);
		comServ.ajouterCommandeService(com);
		init();
		return "listCommande.xhtml" ;
	}
	
	public String supprimerCommande(long id){
		comServ.deleteCommandeService(id);
		init();
		return "listCommande.xhtml";
	}
	
	public String modifierCommande(long id){
		com = comServ.getCommandeByIdService(id);
		return "formulaireCommande.xhtml";
	}
	
	public String updateCommande(){
		client = cli.getClientByIdService(selectedClient);
		pizza  = piz.getPizzaById(selectedPizza);
		com.setClient(client);
		com.setPiz(pizza);
		comServ.updateCommandeService(com);
		init();
		return "listCommande.xhtml";
	}
	
	public String goAjoutCommande(){
		init();
		com = new Commande();		
		return "formulaireCommande.xhtml";
	}
}
