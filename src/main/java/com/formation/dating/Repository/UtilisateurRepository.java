package com.formation.dating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entity.Utilisateur;


@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, String> {
Utilisateur findUtilisateurByEmailUtilisateurAndMotDePasse(String emailUtilisateur, String motDePasse);
//Utilisateur findUtilisateurByEmailAndPAsswordAndAdmin(String emailUtilisateur, String motDePasse,Integer typeAdmin);
}
