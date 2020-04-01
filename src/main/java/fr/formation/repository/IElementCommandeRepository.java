package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.models.ElementCommande;

public interface IElementCommandeRepository extends JpaRepository<ElementCommande, Long> {

}
