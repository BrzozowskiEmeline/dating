package com.formation.dating.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import come.formation.dating.Repository.SituationRepository;

@Service
public class SituationService {
	
	private final SituationRepository sr;

	@Autowired
	public SituationService(SituationRepository sr) {
		super();
		this.sr = sr;
	}
	
	
	

}
