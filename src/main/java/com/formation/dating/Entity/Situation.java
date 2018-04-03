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
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- ]{1,150}", message = "{ Champs vide}")
	private String statutPro;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- ]{1,150}", message = "{ Champs vide}")
	private String statutPerso;
	
	@NotBlank
	private String orientation;
	
	@NotBlank
	private String fumeur;
	
	@NotBlank
	private String alcool;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- ]{1,150}", message = "{ Champs vide}")
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









	public Situation(Long id, String statutPro, String statutPerso, String orientation, String fumeur, String alcool,
			int numero) {
		super();
		this.id = id;
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
