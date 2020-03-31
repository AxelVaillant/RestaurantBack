package fr.formation.service;

import java.time.LocalDate;
import java.util.List;

import fr.formation.models.Reservation;



public interface IReservationService {

	public List<Reservation> getAllReservation();
	public Reservation getReservationById(long id);
	public boolean createReservation(Reservation reservation,LocalDate datereservation);
	public long deleteReservation(long id);

}
	