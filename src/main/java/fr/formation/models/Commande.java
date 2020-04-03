package fr.formation.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_commande")
	private long idcommande;
	
	@ManyToOne
	@JoinColumn(name="reservation")
	private Reservation reservation;
	
	private double total;
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Commande(long idcommande, Reservation reservation, double total) {
		super();
		this.idcommande = idcommande;
		this.reservation = reservation;
		this.total = total;
	}



	public long getIdcommande() {
		return idcommande;
	}
	public void setIdcommande(long idcommande) {
		this.idcommande = idcommande;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	


	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	@Override
	public String toString() {
		return "Commande [idcommande=" + idcommande + ", reservation=" + reservation + ", total=" + total + "]";
	}






	
}
