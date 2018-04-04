package com.formation.dating.Enum;

public enum typeCheveux {
	Court("Court"),Long("Long"),Rasé("Rasé"),Bouclé("Bouclé"),Autre("Autre");
	
	private String typeCheveux;

	public String getTypeCheveux() {
		return typeCheveux;
	}

	public void setTypeCheveux(String typeCheveux) {
		this.typeCheveux = typeCheveux;
	}

	private typeCheveux(String typeCheveux) {
		this.typeCheveux = typeCheveux;
	}
	
	
}
