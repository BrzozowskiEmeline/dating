package com.formation.dating.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.formation.dating.Services.UtilisateurService;

@Controller

public class UtilisateurController {
	
	private final UtilisateurService us;

	@Autowired
	public UtilisateurController(UtilisateurService us) {
		super();
		this.us = us;
	}
	
	
	


}
