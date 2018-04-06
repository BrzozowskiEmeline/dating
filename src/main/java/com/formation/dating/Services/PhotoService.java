package com.formation.dating.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dating.Entity.Photo;
import com.formation.dating.Repository.PhotoRepository;

@Service
public class PhotoService {
	
	private final PhotoRepository pr;

	@Autowired
	public PhotoService(PhotoRepository pr) {
		super();
		this.pr = pr;
	}
	
	public void add(Photo photo) {
		pr.save(photo);
	}
}
