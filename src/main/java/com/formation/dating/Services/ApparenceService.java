package com.formation.dating.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dating.Entities.Apparence;
import com.formation.dating.Repositories.ApparenceRepository;

@Service
public class ApparenceService {
	
private final ApparenceRepository apr;

@Autowired
public ApparenceService(ApparenceRepository apr) {
	this.apr = apr;
}

public void add(Apparence apparence) {
	apr.save(apparence);
}


}
