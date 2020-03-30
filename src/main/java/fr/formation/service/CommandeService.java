package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Commande;

import fr.formation.repository.ICommandeRepository;
@Service
public class CommandeService implements ICommandeService {
@Autowired
	ICommandeRepository commanderepository;
	@Override
	public List<Commande> getAllCommande() {
return commanderepository.findAll();
	}

	@Override
	public Commande getCommandeById(long id) {
		Optional<Commande> Commande1 =commanderepository.findById(id);
		Commande Commande = new Commande();
		if(Commande1.isPresent()) {
			Commande=Commande1.get()
;		}
		return Commande;
	}
	

	@Override
	public Commande createCommande(Commande commande) {
return commanderepository.save(commande);
	}

	@Override
	public Commande updateCommande(Commande commande) {
		return commanderepository.save(commande);
	}

}
