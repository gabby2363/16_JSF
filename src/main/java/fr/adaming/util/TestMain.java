package fr.adaming.util;

import java.util.ArrayList;

import org.hibernate.Session;

import fr.adaming.entities.Client;
import fr.adaming.entities.Commande;
import fr.adaming.entities.Pizza;
import fr.adaming.service.ClientServiceImpl;
import fr.adaming.service.CommandeServiceImpl;
import fr.adaming.service.IClientService;
import fr.adaming.service.ICommandeService;
import fr.adaming.service.IPizzaService;
import fr.adaming.service.PizzaServiceImpl;

public class TestMain {
	public static void main(String[] args) {
		IClientService cService = new ClientServiceImpl();
		IPizzaService pService =new PizzaServiceImpl();
		ICommandeService com= new CommandeServiceImpl();
		
		Client c1 = new Client();
		Pizza piz1 = new Pizza();
		Pizza piz2 = new Pizza();
		Pizza piz3 = new Pizza();
		Client c2 =new Client();
		Client c3 =new Client();
		Commande com1 = new Commande();
		ArrayList<Pizza> listPizza =new ArrayList();
		ArrayList<Client> listClient =new ArrayList();
		
		c1.setNom("Brion");
		c1.setPrenom("Gabby");
		cService.ajouterClientService(c1);
		
		c2.setNom("Gar");
		c2.setPrenom("Alvi");
		cService.ajouterClientService(c2);
		
		c3.setNom("truc");
		c3.setPrenom("machin");
		cService.ajouterClientService(c3);
		
		piz1.setNom("Canibale");
		piz1.setDescription("3 type de viande et de la sauce barbecue");
		piz1.setPrix(15.99);
		pService.ajouterPizzaService(piz1);
		
		piz2.setNom("Veggie");
		piz2.setDescription("3 type de légume et de la sauce blanche");
		piz2.setPrix(14.99);
		pService.ajouterPizzaService(piz2);
		
		piz3.setNom("Dégeu");
		piz3.setDescription("plein de truc pas bon");
		piz3.setPrix(8.99);
		pService.ajouterPizzaService(piz3);
		
//		System.out.println(pService.getAllPizzaService());
//		System.out.println(cService.getAllClientService());
		
		//System.out.println(cService.getClientByIdService(2));
		
//		piz3.setNom("pas mieux");
//		pService.updatePizzaService(piz3);
		
//		c3.setNom("nom pourris");
//		cService.updateClientService(c3);
		
//		pService.deletePizzaService(3);
//		cService.deleteClientService(3);
		
		com1.setClient(c1);
		com1.setPiz(piz1);
		com.ajouterCommandeService(com1);
		
	
	}
}
