package fr.formation.service;

import java.util.List;

import fr.formation.models.Reservation;



public interface IReservationService {

	public List<Reservation> getAllReservation();
	public Reservation getReservationById(long id);
	public Reservation createReservation(Reservation reservation);
	public long deleteReservation(long id);

}
