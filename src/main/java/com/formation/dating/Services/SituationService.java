package com.formation.dating.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dating.Entities.Situation;
import com.formation.dating.Repositories.SituationRepository;

@Service
public class SituationService {
	
	private final SituationRepository sr;

	@Autowired
	public SituationService(SituationRepository sr) {
		super();
		this.sr = sr;
	}
	
	public void add(Situation situation) {
		sr.save(situation);
	}
	

}
