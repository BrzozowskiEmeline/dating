package com.formation.dating.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dating.Entity.Apparence;
import com.formation.dating.Repository.ApparenceRepository;

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
