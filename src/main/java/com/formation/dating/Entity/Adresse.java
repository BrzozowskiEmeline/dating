package com.formation.dating.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Adresse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(length = 5)
	private int CodePostal;
	
	@NotBlank
	@Column(length = 40)
	private String ville;
	
	@NotBlank
	@Column(length = 10)
	private int numero;
	
	@NotBlank
	private String typeRue;
	
	
	private String complement;
	
	
	private String prefixe;
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getCodePostal() {
		return CodePostal;
	}


	public void setCodePostal(int codePostal) {
		CodePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getTypeRue() {
		return typeRue;
	}


	public void setTypeRue(String typeRue) {
		this.typeRue = typeRue;
	}


	public String getComplement() {
		return complement;
	}


	public void setComplement(String complement) {
		this.complement = complement;
	}


	public String getPrefixe() {
		return prefixe;
	}


	public void setPrefixe(String prefixe) {
		this.prefixe = prefixe;
	}




	
	public Adresse(Long id, @NotBlank int codePostal, @NotBlank String ville, @NotBlank int numero,
		@NotBlank String typeRue, String complement, String prefixe) {
	super();
	this.id = id;
	CodePostal = codePostal;
	this.ville = ville;
	this.numero = numero;
	this.typeRue = typeRue;
	this.complement = complement;
	this.prefixe = prefixe;
}


	public Adresse() {}
	

}

