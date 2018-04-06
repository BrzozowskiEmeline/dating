package com.formation.dating.Controllers;

import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.formation.dating.Entities.Adresse;
import com.formation.dating.Entities.Apparence;
import com.formation.dating.Entities.CentreInteret;
import com.formation.dating.Entities.Multimedia;
import com.formation.dating.Entities.Photo;
import com.formation.dating.Entities.Situation;
import com.formation.dating.Entities.Utilisateur;
import com.formation.dating.Services.AdresseService;
import com.formation.dating.Services.ApparenceService;
import com.formation.dating.Services.CentreInteretService;
import com.formation.dating.Services.PhotoService;
import com.formation.dating.Services.SituationService;
import com.formation.dating.Services.UtilisateurService;

@Controller
public class UtilisateurController {

	private final UtilisateurService us;
	private final SituationService ss;
	private final CentreInteretService cis;
	private final AdresseService as;
	private final ApparenceService aps;
	private final PhotoService ps;

	@Autowired
	public UtilisateurController(UtilisateurService us, SituationService ss, CentreInteretService cis,
			AdresseService as, ApparenceService aps, PhotoService ps) {
		super();
		this.us = us;
		this.ss = ss;
		this.cis = cis;
		this.as = as;
		this.aps = aps;
		this.ps = ps;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/result")
	public String getform(@ModelAttribute("utilisateur") Utilisateur utilisateur, BindingResult resultUtilisateur,
			@Valid @ModelAttribute("apparence") Apparence apparence, BindingResult resultApparence,
			@Valid @ModelAttribute("centreInteret") CentreInteret centreInteret, BindingResult resultCentreInteret,
			@Valid @ModelAttribute("situation") Situation situation, BindingResult resultSituation,
			@Valid @ModelAttribute("adresse") Adresse adresse, BindingResult resultadresse,
			@Valid @ModelAttribute("multimedia") Multimedia multimedia, BindingResult resultmultimedia,
			@Valid @ModelAttribute("photo") Photo photo, BindingResult resultphoto			
			) {
		  if (resultUtilisateur.hasErrors() || resultadresse.hasErrors() ||
		 resultApparence.hasErrors() || resultCentreInteret.hasErrors() ||
		 resultSituation.hasErrors() ) {
		
		 return "pages/Formulaire"; }
	
		utilisateur.setAdresse(adresse);
		utilisateur.setApparence(apparence);
		//utilisateur.getCentreInterets().add(centreInteret);
		utilisateur.setSituation(situation);
		as.add(adresse);
		aps.add(apparence);
		//ps.add(photo);
		cis.add(centreInteret);
		ss.add(situation);
		us.add(utilisateur);
		
		return "pages/Result";

	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/formulaire")
	public String getform(ModelMap model) {

		model.addAttribute("utilisateur", new Utilisateur());
		model.addAttribute("apparence", new Apparence());
		model.addAttribute("centreInteret", new CentreInteret());
		model.addAttribute("situation", new Situation());
		model.addAttribute("adresse", new Adresse());
		model.addAttribute("multimedia", new Multimedia());
		model.addAttribute("photo", new Photo());
		return "pages/Formulaire";
	}

	
	
	//////////////////////////////Connexion  // Deconnexion ///////////////////
	 
	
	
	@GetMapping("/login") // creation du URL login, pour entrer l'email et le mDp. l'html du login est créer ds la connexion.html,
	//qui elle renvoie a un url connexion. cette URl coonnexion renvoie a la page html compte.
	public String login() {
		return "pages/connexion";
	}

	@RequestMapping(value = "/connexion", method = RequestMethod.POST)  // creation de la redirec tion après la co
	private String connexion(@RequestParam("emailUtilisateur")String emailUtilisateur,
			@RequestParam("motDePasse") String motDePasse, ModelMap model, HttpSession httpSession) {

		Utilisateur utilisateur = us.findUtilisateurByEmailUtilisateurAndMotDePasse(emailUtilisateur, motDePasse);
		if (utilisateur == null) {
			String message = "Votre identifiant ou mot de passe est incorrect";
			model.addAttribute("message", message); 

			return "pages/connexion";

		}

	        this.session(utilisateur, httpSession);
	        String message = "Bienvenue sur votre session";
	        model.addAttribute("message", message);
	        model.addAttribute("utilisateur", utilisateur);
	        return "pages/compte";
	    }
	    
	    
	    @RequestMapping(value = "/logout", method = RequestMethod.GET)
	    private String logout(ModelMap model, HttpSession httpSession) {

	        String message = "Vous êtes deconnecté";
	        model.addAttribute("message", message);
	        httpSession.invalidate();
	        return "pages/logout";
	    }
	//////////////////////////////Temps de Session//////////////////////////////////////////////

	public void session(Utilisateur utilisateur, HttpSession Httpsession) {
		String sessionKey = "dating";

		Object time = Httpsession.getAttribute(sessionKey);
		if (time == null) {
			time = LocalDateTime.now();
			Httpsession.setAttribute(sessionKey, time);

		}

		Httpsession.setAttribute("emailUtilisateur", utilisateur.getEmailUtilisateur());
		Httpsession.setAttribute("speudo", utilisateur.getPseudo());
		Httpsession.setAttribute("admin", utilisateur.getTypeAdmin());
		Httpsession.setAttribute("name", utilisateur.getNom());
		Httpsession.setMaxInactiveInterval(60 * 30);

	}
	
	@GetMapping("/utilisateurs")  // ici utiliser un Model dc faitre avec un addattribute / sinon si c'est un ModelAndView utiliser une list avc return comme annuaire
	public String getAllUtilisateur( Model model) {
		
		model.addAttribute("utilisateurs", us.getAllUtilisateurs());
		return "pages/utilisateurs";
	}
	
	
	
	
	

}
