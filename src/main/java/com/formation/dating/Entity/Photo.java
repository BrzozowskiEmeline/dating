package com.formation.dating.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Photo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- ]{1,150}", message = "{ Champs vide}")
	private String lien;
	
	@Column(length=150)
	private int note;

	
	
	
	@ManyToOne
	private Utilisateur utilisateurs;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}



	



	public Photo(Long id, String lien, int note) {
		super();
		this.id = id;
		this.lien = lien;
		this.note = note;
	}



	public Photo() {}
}
