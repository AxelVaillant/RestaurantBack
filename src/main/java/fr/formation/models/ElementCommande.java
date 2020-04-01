package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ElementCommande {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_element_commande")
	private long idElementCommande;
	
	@ManyToOne
	@JoinColumn(name="commande")
	private Commande commande;
	@OneToOne
	@JoinColumn(name="plat")
	private Plat plat;
	public ElementCommande(long idElementCommande, Commande commande, Plat plat) {
		super();
		this.idElementCommande = idElementCommande;
		this.commande = commande;
		this.plat = plat;
	}
	public ElementCommande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdElementCommande() {
		return idElementCommande;
	}
	public void setIdElementCommande(long idElementCommande) {
		this.idElementCommande = idElementCommande;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Plat getPlat() {
		return plat;
	}
	public void setPlat(Plat plat) {
		this.plat = plat;
	}
	@Override
	public String toString() {
		return "ElementCommande [idElementCommande=" + idElementCommande + ", commande=" + commande + ", plat=" + plat
				+ "]";
	}
	
	
}
