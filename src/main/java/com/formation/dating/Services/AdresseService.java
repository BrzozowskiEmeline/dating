package com.formation.dating.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import come.formation.dating.Repository.AdresseRepository;

@Service
public class AdresseService {
	
	private final AdresseRepository ar;
	
	@Autowired
	public AdresseService(AdresseRepository ar) {
		this.ar = ar;
	}


	
	
}
