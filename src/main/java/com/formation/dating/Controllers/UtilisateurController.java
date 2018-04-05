package com.formation.dating.Controllers;

import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formation.dating.Entity.Adresse;
import com.formation.dating.Entity.Apparence;
import com.formation.dating.Entity.CentreInteret;
import com.formation.dating.Entity.Multimedia;
import com.formation.dating.Entity.Photo;
import com.formation.dating.Entity.Situation;
import com.formation.dating.Entity.Utilisateur;
import com.formation.dating.Services.CentreInteretService;
import com.formation.dating.Services.SituationService;
import com.formation.dating.Services.UtilisateurService;

@Controller
public class UtilisateurController {
	
	private final UtilisateurService us;
	private final SituationService ss;
	private final CentreInteretService cis;
	

	
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
	

	@Autowired
	public UtilisateurController(UtilisateurService us, SituationService ss, CentreInteretService cis) {
		super();
		this.us = us;
		this.ss = ss;
		this.cis = cis;
	}



	@RequestMapping(method = RequestMethod.POST, value = "/result")
	public String getform(
			@ModelAttribute("utilisateur") Utilisateur utilisateur,BindingResult resultUtilisateur,
			@Valid @ModelAttribute("apparence") Apparence apparence,BindingResult resultApparence,
			@Valid @ModelAttribute("centreInteret") CentreInteret centreInteret,BindingResult resultCentreInteret,
			@Valid @ModelAttribute("situation") Situation situation,BindingResult resultSituation,
			@Valid @ModelAttribute("adresse") Adresse adresse,BindingResult resultadresse,
			@Valid @ModelAttribute("multimedia") Multimedia multimedia,BindingResult resultmultimedia,
			@Valid @ModelAttribute("photo") Photo photo,BindingResult resultphoto
			
			) {
//	if (resultUtilisateur.hasErrors() || resultadresse.hasErrors() ||
//			resultApparence.hasErrors() || resultCentreInteret.hasErrors() ||
//			resultSituation.hasErrors()||resultphoto.hasErrors() ) {
//
//			return "pages/Utilisateur";
//			}
//cis.add(centreInteret);
//ss.add(situation);
//us.add(utilisateur);
	return "pages/inscriptionfaite";
	
	}
	

	
	@GetMapping("/login")
	public String login (@ModelAttribute Utilisateur utilisateur, RequestAttribute  attributes,HttpSession Httpsession) {
	
		Utilisateur utilisateur = UtilisateurService.findUtilisateurByEmailUtilisateurAndMotDePasse(utilisateur.getEmailUtilisateur(), utilisateur.getMotDePasse()){
		if(utilisateur != null) {
			this.session(utilisateur, Httpsession);
				return "redirect:/";
				}
				
	}
		}
	
	
	
	public String logout (HttpSession Httpsession){
		Httpsession.invalidate();
		return"redirect:/";
		}
	
		
	
		///////////////////  Ouverture Session  ///////////////////////////
		
		public void session ( Utilisateur utilisateur,HttpSession Httpsession ) {
	String sessionKey  ="dating";
	
	
	Object time = Httpsession.getAttribute(sessionKey);	
		if(time==null) {
		time=LocalDateTime.now();
		Httpsession.setAttribute(sessionKey, time);
		
	}
	
	Httpsession.setAttribute("emailUtilisateur", utilisateur.getEmailUtilisateur());
	Httpsession.setAttribute("speudo", utilisateur.getPseudo());
	Httpsession.setAttribute("admin", utilisateur.getTypeAdmin());
	Httpsession.setAttribute("name", utilisateur.getNom());
	Httpsession.setMaxInactiveInterval(60*30);
	
	
}
}

