package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.models.Plat;

public interface IPlatRepository extends JpaRepository<Plat, Long> {

}
