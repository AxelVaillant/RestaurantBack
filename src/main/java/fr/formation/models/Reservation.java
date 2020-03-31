package fr.formation.models;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_reservation")
	private long idreservation;
	private int nombre;
	private Date datereservation;
	
	@OneToOne
	@JoinColumn(name="client")
	private User client;
	
	@OneToOne
	@JoinColumn(name="r_table")
	private Table table;
	
	public Reservation(long idreservation, int nombre, Date datereservation, User client, Table table) {
		super();
		this.idreservation = idreservation;
		this.nombre = nombre;
		this.datereservation = datereservation;
		this.client = client;
		this.table = table;
	}
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdreservation() {
		return idreservation;
	}
	public void setIdreservation(long idreservation) {
		this.idreservation = idreservation;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	
	public Date getDatereservation() {
		return datereservation;
	}
	public void setDatereservation(Date datereservation) {
		this.datereservation = datereservation;
	}
	@Override
	public String toString() {
		return "Reservation [idreservation=" + idreservation + ", nombre=" + nombre + ", datereservation="
				+ datereservation + ", client=" + client + ", table=" + table + "]";
	}

	
	
	
	
	}
