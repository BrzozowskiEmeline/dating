package com.formation.dating.Enum;

public enum TypeRue {

	A("Allee"),C("Chemin"),I("Impasse"),P("Place"),R("Route"),Av("Avenue"),B("Boulevard");
	
	
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
