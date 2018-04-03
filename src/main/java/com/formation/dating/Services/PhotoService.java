package com.formation.dating.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import come.formation.dating.Repository.PhotoRepository;

@Service
public class PhotoService {
	
	private final PhotoRepository pr;

	@Autowired
	public PhotoService(PhotoRepository pr) {
		super();
		this.pr = pr;
	}
	

}
