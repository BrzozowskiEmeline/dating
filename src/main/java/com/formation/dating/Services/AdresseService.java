package com.formation.dating.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dating.Entity.Adresse;

import come.formation.dating.Repository.AdresseRepository;

@Service
public class AdresseService {
	
	private final AdresseRepository ar;
	
	@Autowired
	public AdresseService(AdresseRepository ar) {
		this.ar = ar;
	}


	
	//ajout des contacts
		public void add(Adresse adress) {
			ar.save(adress);
		}
		
		//affichage 
		public  List<Adresse> affiche() {
			return ar.findAll();
		}
	
	
}
