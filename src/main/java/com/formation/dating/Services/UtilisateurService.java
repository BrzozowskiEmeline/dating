package com.formation.dating.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dating.Entities.Utilisateur;
import com.formation.dating.Repositories.UtilisateurRepository;

@Service
public class UtilisateurService {
	
	private final UtilisateurRepository ur;
//	private final SituationRepository sr;
//	private final CentreInteretRepository cir;

	



	public List<Utilisateur> readAll () {
		return ur.findAll();
		
	}
	@Autowired
	public UtilisateurService(UtilisateurRepository ur) {
		super();
		this.ur = ur;
//		this.sr = sr;
//		this.cir = cir;
	}

	public void add (Utilisateur utilisateur) {
		ur.save(utilisateur);
//		sr.save(situation);
//		cir.save(centreInteret);
	}
	

	
	public Utilisateur findUtilisateurByEmailUtilisateurAndMotDePasse(String emailUtilisateur, String motDePasse) {
		return ur.findUtilisateurByEmailUtilisateurAndMotDePasse(emailUtilisateur, motDePasse);
	}
	
//	public Utilisateur findUtilisateurByEmailAndPAsswordAndAdmin(String emailUtilisateur, String motDePasse, Integer typeAdmin) {
//		return ur.findUtilisateurByEmailAndPAsswordAndAdmin(emailUtilisateur, motDePasse,typeAdmin);
//	}

}
