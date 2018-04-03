package com.formation.dating.Services;

import javax.persistence.Entity;

@Entity
public class Multimedia {

	private String typeMultimedia;
	private String genre;
	private String titre;
	private String artiste;
	
	
	
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



	public Multimedia(String typeMultimedia, String genre, String titre, String artiste) {
		super();
		this.typeMultimedia = typeMultimedia;
		this.genre = genre;
		this.titre = titre;
		this.artiste = artiste;
	}



	public Multimedia() {
		
	}
	
}
