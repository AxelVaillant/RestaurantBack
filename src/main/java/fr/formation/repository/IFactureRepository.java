package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.models.Facture;

public interface IFactureRepository extends JpaRepository<Facture, Long>{

}
