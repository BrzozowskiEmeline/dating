package com.formation.dating.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entities.Utilisateur;


@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, String> {
	Utilisateur findUtilisateurByEmailUtilisateur(String emailUtilisateur);
	Utilisateur findUtilisateurByEmailUtilisateurAndMotDePasse(String emailUtilisateur, String motDePasse);
//Utilisateur findUtilisateurByEmailAndPAsswordAndAdmin(String emailUtilisateur, String motDePasse,Integer typeAdmin);

}
