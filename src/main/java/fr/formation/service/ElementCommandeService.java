package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.ElementCommande;
import fr.formation.models.ElementCommande;
import fr.formation.repository.IElementCommandeRepository;
@Service
public class ElementCommandeService implements IElementCommandeService{
@Autowired
	IElementCommandeRepository elcorepo;
	@Override
	public List<ElementCommande> getAllElementCommande() {
		return elcorepo.findAll();
	}

	@Override
	public ElementCommande getElementCommandeById(long id) {
		Optional<ElementCommande> ElementCommande1 =elcorepo.findById(id);
		ElementCommande ElementCommande = new ElementCommande();
		if(ElementCommande1.isPresent()) {
			ElementCommande=ElementCommande1.get()
;		}
		return ElementCommande;
	}

	@Override
	public ElementCommande createElementCommande(ElementCommande elementcommande) {
return elcorepo.save(elementcommande);

	}

	@Override
	public long deleteElementCommande(long id) {
		try {
			elcorepo.deleteById(id);
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}

	@Override
	public ElementCommande updateElementCommande(ElementCommande elementcommande) {
		return elcorepo.save(elementcommande);
	}

	@Override
	public ElementCommande recupPlat(ElementCommande elementcommande) {
		return elcorepo.save(elementcommande);
	}

}
