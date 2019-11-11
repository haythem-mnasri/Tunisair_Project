package com.tunisair.microservice.avionservice;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Avion implements Serializable{
	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id;
	private String ref;
	private String version;
	private Float longueur;
	private int autonomie;
	
	
	public Avion() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Float getLongueur() {
		return longueur;
	}
	public void setLongueur(Float longueur) {
		this.longueur = longueur;
	}
	public int getAutonomie() {
		return autonomie;
	}
	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}

	public Avion(String ref, String version, Float longueur, int autonomie) {
		super();
		this.ref = ref;
		this.version = version;
		this.longueur = longueur;
		this.autonomie = autonomie;
	}
	
	@Override
	public String toString() {
		return "Avion [ref=" + ref + ", version=" + version + ", longueur=" + longueur + ", autonomie="
				+ autonomie + "]";
	}

	
}
