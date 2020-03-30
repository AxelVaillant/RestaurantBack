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

import fr.formation.models.Plat;
import fr.formation.service.IPlatService;

@RestController
@RequestMapping("plat")
@CrossOrigin("http://localhost:4200")
public class PlatController {
	@Autowired
IPlatService platservice;
	
	@GetMapping("/all")
	public List<Plat> getAllPlat(){
		return platservice.getAllPlat();
	}
	
	@GetMapping("/byid/{id}")
	public Plat getPlatbyid(@PathVariable long id) {
		return platservice.getPlatById(id);
	}

	@PostMapping("/save")
	public Plat createPlat(@RequestBody Plat plat) {
		return platservice.createPlat(plat);
	}
	
	@PostMapping("/delete/{id}")
	public long deletePlat(@PathVariable long id) {
		return platservice.deletePlat(id);
	}
	@PutMapping("/update/{id}")
	public Plat updatePlat(@PathVariable long id, @RequestBody Plat plat) {
		Plat platmodif=platservice.getPlatById(id);
		platmodif.setNomplat(plat.getNomplat());
		platmodif.setPrixplat(plat.getPrixplat());
		platmodif.setCommande(plat.getCommande());

		return platservice.updatePlat(plat);
	}
}
