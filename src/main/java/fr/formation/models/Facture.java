package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_facture")
	private long idfacture;
	private double montant;
	
	@OneToOne
	@JoinColumn(name="reservation")
	private Reservation reservation;
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facture(long idfacture, double montant, Reservation reservation) {
		super();
		this.idfacture = idfacture;
		this.montant = montant;
		this.reservation = reservation;
	}
	public long getIdfacture() {
		return idfacture;
	}
	public void setIdfacture(long idfacture) {
		this.idfacture = idfacture;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	@Override
	public String toString() {
		return "Facture [idfacture=" + idfacture + ", montant=" + montant + ", reservation=" + reservation + "]";
	}
	
	
}
