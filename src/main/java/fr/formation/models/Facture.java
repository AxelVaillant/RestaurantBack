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
	@JoinColumn(name="commande")
	private Commande commande;
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facture(long idfacture, double montant, Commande commande) {
		super();
		this.idfacture = idfacture;
		this.montant = montant;
		this.commande = commande;
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

	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	@Override
	public String toString() {
		return "Facture [idfacture=" + idfacture + ", montant=" + montant + ", commande=" + commande + "]";
	}
	
	
}
