package fr.adaming.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.adaming.entities.Client;
import fr.adaming.entities.Pizza;
import fr.adaming.service.ClientServiceImpl;
import fr.adaming.service.IClientService;

@ManagedBean(name="clientBean")
@SessionScoped
public class ClientBean implements Serializable{

	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Client client = new Client();
	IClientService cServ = new ClientServiceImpl();
	List<Client> listClient = new ArrayList<>();
	
	public IClientService getcServ() {
		return cServ;
	}
	public void setcServ(IClientService cServ) {
		this.cServ = cServ;
	}
	public List<Client> getListClient() {
		return listClient;
	}
	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}
	
	
	public void init(){
		listClient=cServ.getAllClientService();
	}
	
	public String afficherListClient(){
		init();
		return "listClient.xhtml";
	}
	
	public String ajouterClient(){
		cServ.ajouterClientService(client);
		init();
		return "listClient.xhtml" ;
	}
	
	public String supprimerClient(long id){
		cServ.deleteClientService(id);
		init();
		return "listClient.xhtml";
	}
	
	public String modifierClient(long id){
		client = cServ.getClientByIdService(id);
		return "formulaireClient.xhtml";
	}
	
	public String updateClient(){
		cServ.updateClientService(client);
		init();
		return "listClient.xhtml";
	}
	
	public String goAjoutClient(){
		client = new Client();		
		return "formulaireClient.xhtml";
	}

}
