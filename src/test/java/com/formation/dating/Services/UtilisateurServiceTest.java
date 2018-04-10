package com.formation.dating.Services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.formation.dating.Entities.Utilisateur;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilisateurServiceTest {

	@Autowired
	private UtilisateurService us;

	@Test
	public void FindUtilisateurByEmailUtilisateur() {
		
		String emailUtilisateur = "emeer@hotmail.fr";
		Utilisateur user = us.findUtilisateurByEmailUtilisateur(emailUtilisateur);
		Assert.assertEquals(user.getEmailUtilisateur(),emailUtilisateur);
		Assert.assertNotNull(user);
		
		emailUtilisateur ="jerome@hotmail.fr";
				user = us.findUtilisateurByEmailUtilisateur(emailUtilisateur);
		Assert.assertEquals(user.getEmailUtilisateur(),emailUtilisateur);
		
	}
	
//	@Test
//	public void add() {
//		us.add(user);
//	}
	
	

}
