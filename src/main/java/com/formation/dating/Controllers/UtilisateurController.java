package com.formation.dating.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formation.dating.Entity.Utilisateur;
import com.formation.dating.Services.UtilisateurService;

@Controller

public class UtilisateurController {
	
	private final UtilisateurService us;

	@Autowired
	public UtilisateurController(UtilisateurService us) {
		super();
		this.us = us;
	}
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/formulaire")
	public String getform(Model model) {
		model.addAttribute("Utilisateur", new Utilisateur());
		return "pages/Utilisateur" ;
	}
	
	


}
