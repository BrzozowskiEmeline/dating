package com.formation.dating.Enum;

public enum couleurCheveux {
	Blond("Blond"),Brun("Brun"),Roux("Roux"),Poivre_et_Sel("Poivre et Sel"),Noir("Noir"),Blanc("Blanc"),Autre("Autre");
	
	private String couleurCheveux;

	public String getCouleurCheveux() {
		return couleurCheveux;
	}

	public void setCouleurCheveux(String couleurCheveux) {
		this.couleurCheveux = couleurCheveux;
	}

	private couleurCheveux(String couleurCheveux) {
		this.couleurCheveux = couleurCheveux;
	}
	

}
