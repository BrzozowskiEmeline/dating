package com.formation.dating.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Apparence {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(length= 3)
	private int taille;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- ]{1,10}", message = "{ Champs vide}")
	private String couleurYeux;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- ]{1,10}", message = "{ Champs vide}")
	private String origine;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- ]{1,10}", message = "{ Champs vide}")
	private String couleurCheveux;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- ]{1,10}", message = "{ Champs vide}")
	private String typeCheveux;
	
	
	private float masse;
	
	
	
	
	@OneToMany(mappedBy="apparence")
	private List<Utilisateur> utilisateurs;
	
	
	
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

	
	




	public Apparence(Long id, @NotBlank int taille,
			@NotBlank @Pattern(regexp = "(?i)[a-z- ]{1,10}", message = "{ Champs vide}") String couleurYeux,
			@NotBlank @Pattern(regexp = "(?i)[a-z- ]{1,10}", message = "{ Champs vide}") String origine,
			@NotBlank @Pattern(regexp = "(?i)[a-z- ]{1,10}", message = "{ Champs vide}") String couleurCheveux,
			@NotBlank @Pattern(regexp = "(?i)[a-z- ]{1,10}", message = "{ Champs vide}") String typeCheveux,
			@NotBlank @Pattern(regexp = "(?i)[0-9 ]{1,3}", message = "{ Champs vide}") float masse) {
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
