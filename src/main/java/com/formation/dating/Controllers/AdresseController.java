package com.formation.dating.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.formation.dating.Entity.Adresse;
import com.formation.dating.Services.AdresseService;

@Controller
public class AdresseController {

	
	
private final AdresseService as;
	
	@Autowired
	public AdresseController(AdresseService as) {
		super();
		this.as = as;
	}
	@RequestMapping("/adresseadd")
	public void ajout() {
		as.add(new Adresse(1L,59300, "Lille",13, typeRue, complement, prefixe)
		

	}
	@GetMapping("/adress")
	public  List<Adresse> affiche() {
		return as.affiche();
	}
	
}
