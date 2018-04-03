package com.formation.dating.Entity;

public enum sexe {

	
	H("Homme"),F("Femme");
	
	private String nom;
	private sexe(String nom) {
	this.nom = nom;
	}
	
	
	public String getNom() {
	return nom;
	}
	
	
	public void setNom(String nom) {
	this.nom = nom;
	}
}
