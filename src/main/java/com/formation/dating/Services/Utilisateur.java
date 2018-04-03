package com.formation.dating.Services;

import javax.persistence.Entity;

@Entity
public class Utilisateur {
	
	private String nom;
	private String prenom;
	private int dateDeNaissance;
	private String sexe;
	private String motDePasse;
	private String description;
	private String pseudo;
	private int numeroTel;
	private int type;
	
	
	
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



	public int getDateDeNaissance() {
		return dateDeNaissance;
	}



	public void setDateDeNaissance(int dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}



	public String getSexe() {
		return sexe;
	}



	public void setSexe(String sexe) {
		this.sexe = sexe;
	}



	public String getMotDePasse() {
		return motDePasse;
	}



	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getPseudo() {
		return pseudo;
	}



	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}



	public int getNumeroTel() {
		return numeroTel;
	}



	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}



	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}


	

	public Utilisateur(String nom, String prenom, int dateDeNaissance, String sexe, String motDePasse,
			String description, String pseudo, int numeroTel, int type) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.sexe = sexe;
		this.motDePasse = motDePasse;
		this.description = description;
		this.pseudo = pseudo;
		this.numeroTel = numeroTel;
		this.type = type;
	}


	
	

	public Utilisateur() {}

}
