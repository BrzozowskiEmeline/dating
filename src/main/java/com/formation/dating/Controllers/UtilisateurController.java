package com.formation.dating.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
//	utilisateur.setAdresse(adresse);
//	utilisateur.setApparence(apparence);
//	utilisateur.getCentreInterets().add(centreInterets);
//	utilisateur.setSituation(situation);
	/*utilisateur.getPhotos().add(photo);*/
//	as.create(adresse);
//	aps.create(apparence);
//	cs.create(centreInterets);
//	ss.create(situation);
us.add(utilisateur);
	return "pages/inscriptionfaite";
	
	}
	@RequestMapping(method= RequestMethod.POST, value = "/inscription")
	public void add() {
		us.add(new Utilisateur());
		
	}
	@RequestMapping(method = RequestMethod.GET, value = "/inscriptionfaite")
	public List<Utilisateur> readAll(){
		return us.readAll();
		
	}

	
		
	
		//@PostMapping("/login")
		//public String login(@ModelAttribute Utilisateur utilisateur, RedirectAttributes attributes, HttpSession HttpSession )
//	String motDePasse = 
//	Utilisateur utilisateur =
//	if(utilisateur==null) {
//		
//	}
	
	

}

