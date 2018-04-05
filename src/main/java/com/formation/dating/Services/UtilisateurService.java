package com.formation.dating.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dating.Entity.Utilisateur;
import com.formation.dating.Repository.UtilisateurRepository;

@Service
public class UtilisateurService {
	
	private final UtilisateurRepository ur;

	@Autowired
	public UtilisateurService(UtilisateurRepository ur) {
		super();
		this.ur = ur;
	}
	
	
	public List<Utilisateur> readAll () {
		return ur.findAll();
		
	}
	
	public void add (Utilisateur utilisateur) {
		ur.save(utilisateur);
	}
	

	
	public Utilisateur findUtilisateurByEmailUtilisateurAndMotDePasse(String emailUtilisateur, String motDePasse) {
		return ur.findUtilisateurByEmailUtilisateurAndMotDePasse(emailUtilisateur, motDePasse);
	}
	
//	public Utilisateur findUtilisateurByEmailAndPAsswordAndAdmin(String emailUtilisateur, String motDePasse, Integer typeAdmin) {
//		return ur.findUtilisateurByEmailAndPAsswordAndAdmin(emailUtilisateur, motDePasse,typeAdmin);
//	}

}
