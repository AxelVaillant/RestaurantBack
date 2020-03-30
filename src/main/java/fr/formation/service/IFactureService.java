package fr.formation.service;

import java.util.List;

import fr.formation.models.Facture;



public interface IFactureService {

	public List<Facture> getAllFacture();
	public Facture getFactureById(long id);
	public Facture createFacture(Facture facture);


}
