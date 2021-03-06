package fr.formation.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import fr.formation.models.Reservation;
import fr.formation.models.Table;



public interface IReservationService {

	public List<Reservation> getAllReservation();
	public Reservation getReservationById(long id);
	public boolean createReservation(Reservation reservation);
	public long deleteReservation(long id);

}
	