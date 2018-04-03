package com.formation.dating.Services;

import javax.persistence.Entity;

@Entity
public class CentreInteret {
	
	private String sport;
	private String loisir;
	
	
	
	
	
	public String getSport() {
		return sport;
	}


	public void setSport(String sport) {
		this.sport = sport;
	}


	public String getLoisir() {
		return loisir;
	}


	public void setLoisir(String loisir) {
		this.loisir = loisir;
	}




	

	public CentreInteret(String sport, String loisir) {
		super();
		this.sport = sport;
		this.loisir = loisir;
	}





	public CentreInteret() {
		
	}
}
