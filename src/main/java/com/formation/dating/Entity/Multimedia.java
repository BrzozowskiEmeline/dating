package com.formation.dating.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Multimedia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String typeMultimedia;
	private String genre;
	private String titre;
	private String artiste;
	
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTypeMultimedia() {
		return typeMultimedia;
	}



	public void setTypeMultimedia(String typeMultimedia) {
		this.typeMultimedia = typeMultimedia;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getArtiste() {
		return artiste;
	}



	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}



	



	public Multimedia(Long id, String typeMultimedia, String genre, String titre, String artiste) {
		super();
		this.id = id;
		this.typeMultimedia = typeMultimedia;
		this.genre = genre;
		this.titre = titre;
		this.artiste = artiste;
	}



	public Multimedia() {
		
	}
	
}
