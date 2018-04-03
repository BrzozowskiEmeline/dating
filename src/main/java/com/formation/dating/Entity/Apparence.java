package com.formation.dating.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Apparence {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(length= 3)
	private int taille;
	
	@NotBlank
	private String couleurYeux;
	
	
	private String origine;
	
	@NotBlank
	private String couleurCheveux;
	
	
	private String typeCheveux;
	
	@NotBlank
	private float masse;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public int getTaille() {
		return taille;
	}



	public void setTaille(int taille) {
		this.taille = taille;
	}



	public String getCouleurYeux() {
		return couleurYeux;
	}



	public void setCouleurYeux(String couleurYeux) {
		this.couleurYeux = couleurYeux;
	}



	public String getOrigine() {
		return origine;
	}



	public void setOrigine(String origine) {
		this.origine = origine;
	}



	public String getCouleurCheveux() {
		return couleurCheveux;
	}



	public void setCouleurCheveux(String couleurCheveux) {
		this.couleurCheveux = couleurCheveux;
	}



	public String getTypeCheveux() {
		return typeCheveux;
	}



	public void setTypeCheveux(String typeCheveux) {
		this.typeCheveux = typeCheveux;
	}



	public float getMasse() {
		return masse;
	}



	public void setMasse(float masse) {
		this.masse = masse;
	}

	
	





	public Apparence(Long id, @NotBlank int taille, @NotBlank String couleurYeux, String origine,
			@NotBlank String couleurCheveux, String typeCheveux, @NotBlank float masse) {
		super();
		this.id = id;
		this.taille = taille;
		this.couleurYeux = couleurYeux;
		this.origine = origine;
		this.couleurCheveux = couleurCheveux;
		this.typeCheveux = typeCheveux;
		this.masse = masse;
	}



	public Apparence(){
		
	}

}
