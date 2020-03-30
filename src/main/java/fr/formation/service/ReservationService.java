package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Reservation;

import fr.formation.repository.IReservationRepository;
@Service
public class ReservationService implements IReservationService{
@Autowired
	IReservationRepository reservationrepository;
	@Override
	public List<Reservation> getAllReservation() {
return reservationrepository.findAll();
	}

	@Override
	public Reservation getReservationById(long id) {
		Optional<Reservation> Reservation1 =reservationrepository.findById(id);
		Reservation Reservation = new Reservation();
		if(Reservation1.isPresent()) {
			Reservation=Reservation1.get()
;		}
		return Reservation;
	}

	@Override
	public Reservation createReservation(Reservation reservation) {
return reservationrepository.save(reservation);
	}

	@Override
	public long deleteReservation(long id) {
		try {
			reservationrepository.deleteById(id);
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}

}
