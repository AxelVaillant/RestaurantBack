package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_role")
	private long idrole;
	private String nomrole;
	public Role(long idrole, String nomrole) {
		super();
		this.idrole = idrole;
		this.nomrole = nomrole;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdrole() {
		return idrole;
	}
	public void setIdrole(long idrole) {
		this.idrole = idrole;
	}
	public String getNomrole() {
		return nomrole;
	}
	public void setNomrole(String nomrole) {
		this.nomrole = nomrole;
	}
	@Override
	public String toString() {
		return "Role [idrole=" + idrole + ", nomrole=" + nomrole + "]";
	}
	
	
}
