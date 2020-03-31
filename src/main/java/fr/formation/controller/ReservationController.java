package fr.formation.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Reservation;

import fr.formation.service.IReservationService;

@RestController
@RequestMapping("reservation")
@CrossOrigin("http://localhost:4200")
public class ReservationController {
	@Autowired
	IReservationService reservationservice;
	
	@GetMapping("/all")
	public List<Reservation> getAllReservation(){
		return reservationservice.getAllReservation();
	}
	
	@GetMapping("/byid/{id}")
	public Reservation getReservationbyid(@PathVariable long id) {
		return reservationservice.getReservationById(id);
	}

	@PostMapping("/save")
	public boolean createReservation(@RequestBody Reservation reservation) {
		return reservationservice.createReservation(reservation);
	}
	
	@PostMapping("/delete/{id}")
	public long deleteReservation(@PathVariable long id) {
		return reservationservice.deleteReservation(id);
	}

}
