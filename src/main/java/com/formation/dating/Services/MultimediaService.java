package com.formation.dating.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dating.Repositories.MultimediaRepository;

@Service
public class MultimediaService {
	
	public MultimediaRepository mr;

	@Autowired
	public MultimediaService(MultimediaRepository mr) {
		super();
		this.mr = mr;
	}
	
	


	
}
