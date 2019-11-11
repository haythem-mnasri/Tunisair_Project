package com.tunisair.microservice.piloteservice;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pilote implements Serializable{
	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String prenom;
	private int age;
	private float annee_experience;
	private String specialite;
	private int salaire;
	private String nationalite;
	private String type_contrat;
	private String traget;
	
	
	
	
	
	
	public Pilote(String nom, String prenom, int age, float annee_experience, String specialite, int salaire,
			String nationalite, String type_contrat, String traget) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.annee_experience = annee_experience;
		this.specialite = specialite;
		this.salaire = salaire;
		this.nationalite = nationalite;
		this.type_contrat = type_contrat;
		this.traget = traget;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getAnnee_experience() {
		return annee_experience;
	}
	public void setAnnee_experience(float annee_experience) {
		this.annee_experience = annee_experience;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getType_contrat() {
		return type_contrat;
	}
	public void setType_contrat(String type_contrat) {
		this.type_contrat = type_contrat;
	}
	public String getTraget() {
		return traget;
	}
	public void setTraget(String traget) {
		this.traget = traget;
	}
	@Override
	public String toString() {
		return "Pilote [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", annee_experience="
				+ annee_experience + ", specialite=" + specialite + ", salaire=" + salaire + ", nationalite="
				+ nationalite + ", type_contrat=" + type_contrat + ", traget=" + traget + "]";
	}

	
	
	
	
}
