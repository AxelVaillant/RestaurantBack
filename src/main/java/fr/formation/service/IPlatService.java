package fr.formation.service;

import java.util.List;

import fr.formation.models.Plat;

public interface IPlatService {

	public List<Plat> getAllPlat();
	public Plat getPlatById(long id);
	public Plat createPlat(Plat plat);
	public long deletePlat(long id);
	public Plat updatePlat(Plat plat);
}
