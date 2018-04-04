package com.formation.dating.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formation.dating.Entity.Adresse;
import com.formation.dating.Entity.Apparence;
import com.formation.dating.Entity.CentreInteret;
import com.formation.dating.Entity.Multimedia;
import com.formation.dating.Entity.Photo;
import com.formation.dating.Entity.Situation;
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
	public String getform(ModelMap model) {
		
		model.addAttribute("utilisateur",new Utilisateur());
		model.addAttribute("apparence",new Apparence());
		model.addAttribute("centreInteret",new CentreInteret());
		model.addAttribute("situation",new Situation());
		model.addAttribute("adresse",new Adresse());
		model.addAttribute("multimedia",new Multimedia());
		model.addAttribute("photo",new Photo());
		return "pages/Utilisateur" ;
	}
	

	
	@RequestMapping(method = RequestMethod.POST, value = "/result")
	
	public String getform(
			@ModelAttribute("utilisateur") Utilisateur utilisateur,BindingResult resultUtilisateur,
			@Validated @ModelAttribute("apparence") Apparence apparence,BindingResult resultApparence,
			@Validated @ModelAttribute("centreInteret") CentreInteret centreInteret,BindingResult resultCentreInteret,
			@Validated @ModelAttribute("situation") Situation situation,BindingResult resultSituation,
			@Validated @ModelAttribute("adresse") Adresse adresse,BindingResult resultadresse,
			@Validated @ModelAttribute("multimedia") Multimedia multimedia,BindingResult resultmultimedia,
			@Validated @ModelAttribute("photo") Photo photo,BindingResult resultphoto
			
			)
	
	{
				return "pages/index" ;
	}
	
	
}
