package fr.formation.service;

import java.util.List;

import fr.formation.models.ElementCommande;

public interface IElementCommandeService {

	public List<ElementCommande> getAllElementCommande();
	public ElementCommande getElementCommandeById(long id);
	public ElementCommande createElementCommande(ElementCommande elementcommande);
	public long deleteElementCommande(long id);
	public ElementCommande updateElementCommande(ElementCommande elementcommande);
	public ElementCommande recupPlat(ElementCommande elementcommande);
}
