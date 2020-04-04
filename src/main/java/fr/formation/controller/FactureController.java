package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Commande;
import fr.formation.models.Facture;
import fr.formation.service.ICommandeService;
import fr.formation.service.IFactureService;

@RestController
@RequestMapping("facture")
@CrossOrigin("http://localhost:4200")
public class FactureController {
	@Autowired
	IFactureService factureservice;
	
	@GetMapping("/all")
	public List<Facture> getAllFacture(){
		return factureservice.getAllFacture();
	}
	
	@GetMapping("/byid/{id}")
	public Facture getFacturebyid(@PathVariable long id) {
		return factureservice.getFactureById(id);
	}

	@PostMapping("/save")
	public Facture createFacture(@RequestBody Facture facture) {

		facture.setMontant(facture.getCommande().getTotal());
		return factureservice.createFacture(facture);
	}
}
