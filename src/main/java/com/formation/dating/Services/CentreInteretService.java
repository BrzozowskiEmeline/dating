package com.formation.dating.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import come.formation.dating.Repository.CentreInteretRepository;

@Service
public class CentreInteretService {
	
	private final CentreInteretRepository cir;

	@Autowired
	public CentreInteretService(CentreInteretRepository cir) {
		super();
		this.cir = cir;
	}
	
	

}
