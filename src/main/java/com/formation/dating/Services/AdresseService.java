package com.formation.dating.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dating.Entities.Adresse;
import com.formation.dating.Repositories.AdresseRepository;

@Service
public class AdresseService {
	
	private final AdresseRepository ar;
	
	@Autowired
	public AdresseService(AdresseRepository ar) {
		this.ar = ar;
	}


	
	//ajout des contacts
		public void add(Adresse adresse) {
			ar.save(adresse);
		}
		
		//affichage 
		public  List<Adresse> affiche() {
			return ar.findAll();
		}



	
}
