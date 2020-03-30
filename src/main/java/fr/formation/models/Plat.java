package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Plat {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_plat")
	private long idplat;
	private String nomplat;
	private int prixplat;
	
	@ManyToOne
	@JoinColumn(name="commande")
	private Commande commande;
	public Plat(long idplat, String nomplat, int prixplat, Commande commande) {
		super();
		this.idplat = idplat;
		this.nomplat = nomplat;
		this.prixplat = prixplat;
		this.commande = commande;
	}
	public Plat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdplat() {
		return idplat;
	}
	public void setIdplat(long idplat) {
		this.idplat = idplat;
	}
	public String getNomplat() {
		return nomplat;
	}
	public void setNomplat(String nomplat) {
		this.nomplat = nomplat;
	}
	public int getPrixplat() {
		return prixplat;
	}
	public void setPrixplat(int prixplat) {
		this.prixplat = prixplat;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	@Override
	public String toString() {
		return "Plat [idplat=" + idplat + ", nomplat=" + nomplat + ", prixplat=" + prixplat + ", commande=" + commande
				+ "]";
	}
	
	
}
