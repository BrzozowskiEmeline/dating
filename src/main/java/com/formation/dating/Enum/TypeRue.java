package com.formation.dating.Enum;

public enum TypeRue {

	All�e("Allee"),Avenue("Avenue"),Chemin("Chemin"),Impasse("Impasse"),Place("Place"),Route("Route"),Chauss�e("Chauss�e"),Boulevard("Boulevard"),Lieudit("Lieu-dit");
	
	
	private String rue;

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	private TypeRue(String rue) {
		this.rue = rue;
	}

	
	
}
