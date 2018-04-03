package com.formation.dating.Services;

import javax.persistence.Entity;

@Entity
public class Photo {
	private String lien;
	private int note;

	
	
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



	public Photo(String lien, int note) {
		super();
		this.lien = lien;
		this.note = note;
	}



	public Photo() {}
}
