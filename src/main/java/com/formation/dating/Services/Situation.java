package com.formation.dating.Services;

import javax.persistence.Entity;

@Entity
public class Situation {
	
	private String statutPro;
	private String statutPerso;
	private String orientation;
	private String fumeur;
	private String alcool;
	private int numero;
	
	
	
	
	public String getStatutPro() {
		return statutPro;
	}




	public void setStatutPro(String statutPro) {
		this.statutPro = statutPro;
	}




	public String getStatutPerso() {
		return statutPerso;
	}




	public void setStatutPerso(String statutPerso) {
		this.statutPerso = statutPerso;
	}




	public String getOrientation() {
		return orientation;
	}




	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}




	public String getFumeur() {
		return fumeur;
	}




	public void setFumeur(String fumeur) {
		this.fumeur = fumeur;
	}




	public String getAlcool() {
		return alcool;
	}




	public void setAlcool(String alcool) {
		this.alcool = alcool;
	}




	public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}




	public Situation(String statutPro, String statutPerso, String orientation, String fumeur, String alcool,
			int numero) {
		super();
		this.statutPro = statutPro;
		this.statutPerso = statutPerso;
		this.orientation = orientation;
		this.fumeur = fumeur;
		this.alcool = alcool;
		this.numero = numero;
	}




	public Situation() {
		
	}

}
