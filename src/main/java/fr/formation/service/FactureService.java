package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Facture;

import fr.formation.repository.IFactureRepository;
@Service
public class FactureService implements IFactureService{
@Autowired
	IFactureRepository facturerepository;
	@Override
	public List<Facture> getAllFacture() {
return facturerepository.findAll();
	}

	@Override
	public Facture getFactureById(long id) {
		Optional<Facture> Facture1 =facturerepository.findById(id);
		Facture Facture = new Facture();
		if(Facture1.isPresent()) {
			Facture=Facture1.get()
;		}
		return Facture;
	}

	@Override
	public Facture createFacture(Facture facture) {
return facturerepository.save(facture);
	}

}
