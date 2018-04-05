package com.formation.dating.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dating.Entity.CentreInteret;
import com.formation.dating.Repository.CentreInteretRepository;

@Service
public class CentreInteretService {
	
	private final CentreInteretRepository cir;

	@Autowired
	public CentreInteretService(CentreInteretRepository cir) {
		super();
		this.cir = cir;
	}
	
	
	public void add(CentreInteret centreInteret) {
		cir.save(centreInteret);
	}
}
