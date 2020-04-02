package fr.formation.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.formation.models.Reservation;
import fr.formation.models.Table;

public interface IReservationRepository extends JpaRepository<Reservation, Long> {
	@Query("from Reservation where datereservation = (:datereservation) and r_table = (:table)")
	public Reservation resa(@Param("datereservation") Date datereservation,@Param("table") Table table);
}
