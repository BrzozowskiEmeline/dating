package com.formation.dating.Enum;

public enum Prefixe {
	
	Aucun("Aucun"),Bis("Bis"),Ter("Ter");
	
	private String prefixe;

	public String getPrefixe() {
		return prefixe;
	}

	public void setPrefixe(String prefixe) {
		this.prefixe = prefixe;
	}

	private Prefixe(String prefixe) {
		this.prefixe = prefixe;
	}


	
	

}
