package com.formation.dating.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Situation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	//@Pattern(regexp = "(?i)[a-z- ]{1,150}", message = "{ Champs vide}")
	private String statutPerso;
	
	private String statutPro;
	
	private int NbreEnfant;
	
	@NotBlank
	private String orientation;
	
	@NotBlank
	private String fumeur;
	
	@NotBlank
	private String alcool;
	
	
	
	private int numero;
	
	
	@OneToMany(mappedBy="situation")
	private List<Utilisateur> utilisateurs;
 

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public int getNbreEnfant() {
		return NbreEnfant;
	}
	public void setNbreEnfant(int nbreEnfant) {
		NbreEnfant = nbreEnfant;
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
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	public Situation(Long id,
			@NotBlank @Pattern(regexp = "(?i)[a-z- ]{1,150}", message = "{ Champs vide}") String statutPro,
			@NotBlank @Pattern(regexp = "(?i)[a-z- ]{1,150}", message = "{ Champs vide}") String statutPerso,
			@NotBlank int nbreEnfant, @NotBlank String orientation, @NotBlank String fumeur, @NotBlank String alcool,
			@NotBlank @Pattern(regexp = "(?i)[a-z- ]{1,150}", message = "{ Champs vide}") int numero,
			List<Utilisateur> utilisateurs) {
		super();
		this.id = id;
		this.statutPro = statutPro;
		this.statutPerso = statutPerso;
		this.NbreEnfant = nbreEnfant;
		this.orientation = orientation;
		this.fumeur = fumeur;
		this.alcool = alcool;
		this.numero = numero;
		this.utilisateurs = utilisateurs;
	}
	public Situation() {
		
	}

}
