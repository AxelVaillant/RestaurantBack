package fr.formation.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.formation.models.Commande;
import fr.formation.models.ElementCommande;



public interface IElementCommandeRepository extends JpaRepository<ElementCommande, Long> {

	@Query("from ElementCommande where commande = (:commande)")
	public List<ElementCommande> getAllByCommande(@Param("commande") Commande commande);
	
	public List<ElementCommande> findByCommande(Commande commande);
}
