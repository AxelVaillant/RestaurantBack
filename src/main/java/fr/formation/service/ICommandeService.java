package fr.formation.service;

import java.util.List;

import fr.formation.models.Commande;



public interface ICommandeService {

	public List<Commande> getAllCommande();
	public Commande getCommandeById(long id);
	public Commande createCommande(Commande commande);
	public Commande updateCommande(Commande commande);
}
