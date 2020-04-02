package fr.formation.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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
	public boolean createReservation(Reservation reservation) {

		try {
			
			Reservation res= new Reservation();
			res=reservationrepository.resa(reservation.getDatereservation(), reservation.getTable());	
			if(res==null) {
				reservationrepository.save(reservation);
				System.err.println("Resa effecutée 1");
				return true;
			}
			else { System.err.println("Resa impossible");
			return false;}
//			else if (res!=null) {
//				if(res.getTable()!=reservation.getTable() || res.getDatereservation()!=reservation.getDatereservation()) {
//					reservationrepository.save(reservation);
//					System.err.println("Resa effecutée 2");
//				}
//				else System.err.println("Resa impossible");
//			}

		} catch (Exception e) {
			return false;
		}
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
