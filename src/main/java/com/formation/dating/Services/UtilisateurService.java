package com.formation.dating.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import come.formation.dating.Repository.UtilisateurRepository;

@Service
public class UtilisateurService {
	
	private final UtilisateurRepository ur;

	@Autowired
	public UtilisateurService(UtilisateurRepository ur) {
		super();
		this.ur = ur;
	}
	
	
	
	

}
