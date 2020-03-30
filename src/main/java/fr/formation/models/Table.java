package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
@javax.persistence.Table(name="RTable")
public class Table {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="numero")
	private long idtable;
	private int places;
	
	@OneToOne
	@JoinColumn(name="serveur")
	private User serveur;
	private boolean disponible;
	public Table(long idtable, int places, User serveur, boolean disponible) {
		super();
		this.idtable = idtable;
		this.places = places;
		this.serveur = serveur;
		this.disponible = disponible;
	}
	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdtable() {
		return idtable;
	}
	public void setIdtable(long idtable) {
		this.idtable = idtable;
	}
	public int getPlaces() {
		return places;
	}
	public void setPlaces(int places) {
		this.places = places;
	}
	public User getServeur() {
		return serveur;
	}
	public void setServeur(User serveur) {
		this.serveur = serveur;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "Table [idtable=" + idtable + ", places=" + places + ", serveur=" + serveur + ", disponible="
				+ disponible + "]";
	}
	
	
}
