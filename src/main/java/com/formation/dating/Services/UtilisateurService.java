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
	
	
	public  List<Utilisateur> affiche() {
		return ur.findAll();
	}
	

}
