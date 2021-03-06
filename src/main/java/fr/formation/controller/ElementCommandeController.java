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
import fr.formation.models.ElementCommande;
import fr.formation.models.Plat;
import fr.formation.service.IElementCommandeService;
import fr.formation.service.IPlatService;

@RestController
@RequestMapping("elementcommande")
@CrossOrigin("http://localhost:4200")
public class ElementCommandeController {
	@Autowired
IElementCommandeService ElementCommandeservice;
	@Autowired
	IPlatService platservice;
	
	@GetMapping("/all")
	public List<ElementCommande> getAllElementCommandes(){
		return ElementCommandeservice.getAllElementCommande();
	}
	
	@PostMapping("/allby")
	public List<ElementCommande> getAllByCommande(@RequestBody ElementCommande ElementCommande){
		return ElementCommandeservice.getAllByCommande(ElementCommande);
	}
	
	
	@GetMapping("/filtre/{id}")
	public List<ElementCommande> getFiltre(@PathVariable long id){
		return ElementCommandeservice.filtre(id);
	}
	
	@GetMapping("/byid/{id}")
	public ElementCommande getElementCommandebyid(@PathVariable long id) {
		return ElementCommandeservice.getElementCommandeById(id);
	}

	@PostMapping("/save")
	public ElementCommande createElementCommande(@RequestBody ElementCommande ElementCommande) {

		
		return ElementCommandeservice.createElementCommande(ElementCommande);
	}
	
	@PostMapping("/recup/{id}")
	public ElementCommande recuPlat(@PathVariable long id, @RequestBody ElementCommande ElementCommande) {
		ElementCommande EC= new ElementCommande();
		Plat p=platservice.getPlatById(id);
		EC.setPlat(p);
		
		return ElementCommandeservice.recupPlat(EC);
	}
	@PostMapping("/delete/{id}")
	public long deleteElementCommande(@PathVariable long id) {
		return ElementCommandeservice.deleteElementCommande(id);
	}
	@PutMapping("/update/{id}")
	public ElementCommande updateElementCommande(@PathVariable long id, @RequestBody ElementCommande ElementCommande) {
		ElementCommande ElementCommandemodif=ElementCommandeservice.getElementCommandeById(id);
		ElementCommandemodif.setPlat(ElementCommande.getPlat());
		ElementCommandemodif.setCommande(ElementCommande.getCommande());


		return ElementCommandeservice.updateElementCommande(ElementCommande);
	}
	

}
