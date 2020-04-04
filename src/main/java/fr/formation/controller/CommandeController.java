package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Commande;
import fr.formation.models.User;
import fr.formation.service.ICommandeService;

@RestController
@RequestMapping("commande")
@CrossOrigin("http://localhost:4200")
public class CommandeController {
	@Autowired
	ICommandeService commandeservice;
	
	@GetMapping("/all")
	public List<Commande> getAllCommande(){
		return commandeservice.getAllCommande();
	}
	
	@GetMapping("/byid/{id}")
	public Commande getCommandebyid(@PathVariable long id) {
		return commandeservice.getCommandeById(id);
	}

	@PostMapping("/save")
	public Commande createCommande(@RequestBody Commande commande) {
		return commandeservice.createCommande(commande);
	}
	
	@PutMapping("/total/{id}")
	public Commande calculTotal(@PathVariable long id , @RequestBody Commande commande) {
		Commande com=commandeservice.getCommandeById(id);
		com.setTotal(commandeservice.calculPrix(id));
		return commandeservice.createCommande(com);	}


}
