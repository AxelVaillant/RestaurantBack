package fr.formation.service;

import java.awt.print.Printable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Plat;

import fr.formation.repository.IPlatRepository;


@Service
public class PlatService implements IPlatService {
@Autowired
	IPlatRepository platrepository;
	@Override
	public List<Plat> getAllPlat() {
return  platrepository.findAll();
	}

	@Override
	public Plat getPlatById(long id) {
		Optional<Plat> Plat1 =platrepository.findById(id);
		Plat Plat = new Plat();
		if(Plat1.isPresent()) {
			Plat=Plat1.get()
;		}
		return Plat;
	}

	@Override
	public Plat createPlat(Plat plat) {
return platrepository.save(plat);
	}

	@Override
	public long deletePlat(long id) {
		try {
			platrepository.deleteById(id);
		} catch (Exception e) {
			
			return 0;
		}
		return 1;
	}

	@Override
	public Plat updatePlat(Plat plat) {
return platrepository.save(plat);
	}


}
