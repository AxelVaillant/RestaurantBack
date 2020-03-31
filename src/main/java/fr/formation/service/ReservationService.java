package fr.formation.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Reservation;
import fr.formation.models.Table;
import fr.formation.repository.IReservationRepository;
@Service
public class ReservationService implements IReservationService{
@Autowired
	IReservationRepository reservationrepository;
@Autowired
	ITableService tableservice;
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
	public boolean createReservation(Reservation reservation,LocalDate datereservation) {
		Table table =null;
		List<Table> tables = new ArrayList<Table>();
		for(Table t :tables  ) {
			if(tableservice.isAvailable(datereservation)) {
				table=t;
				break;
			}}
			if(table!= null) {
				reservationrepository.save(reservation);
				return true;
			}
			return false;
			
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
