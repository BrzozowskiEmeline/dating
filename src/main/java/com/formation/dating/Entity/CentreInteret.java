package com.formation.dating.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class CentreInteret {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- \\- à-ÿ]{1,150}", message = "{ Champs vide}")
	private String sport;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- \\- à-ÿ]{1,150}", message = "{ Champs vide}")
	private String loisir;
	
	
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	
	
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
		this.id = id;
		this.sport = sport;
		this.loisir = loisir;
	}


	public CentreInteret() {
		
	}
}
