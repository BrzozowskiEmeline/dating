package com.formation.dating.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CentreInteret {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String sport;
	private String loisir;
	
	
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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




	





	public CentreInteret(Long id, String sport, String loisir) {
		super();
		this.id = id;
		this.sport = sport;
		this.loisir = loisir;
	}


	public CentreInteret() {
		
	}
}
