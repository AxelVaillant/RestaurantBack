package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.models.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long> {

}
