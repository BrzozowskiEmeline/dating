package com.formation.dating.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import com.formation.dating.Enum.Sexe;


@Entity
public class Utilisateur {
	
	@Id
	private String emailUtilisateur;
	
	@NotNull
	@Column(length = 100)
	private String nom;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z  \\à-ÿ]{2,100}", message = "{com.formation.dating.contraint.prenom.message}")
	@Column(length = 50)
	private String prenom;
	
	
	@DateTimeFormat
	@Column(columnDefinition="date", name="dateDeNaissance")
	private String dateDeNaissance;
	
	
	@NotNull(message = "Message d'\'erreur")
	@Enumerated(EnumType.STRING)
	@Column(length = 8)
	private Sexe sexe;
	
	@NotNull(message = "N'oubliez pas votre Mot de passe")
	@Column(length =10)
	@Pattern(regexp = "(?i)[a-z ]{0,32}")
	private String motDePasse;
	
	@NotNull(message = "Faite nous une petite descritpion ")
	@Column(length =500)
	private String description;
	
	@NotNull(message = "Attention un pseudo est recommandé ")
	@Pattern(regexp = "(?i)[a-z ]{2,32}")
	private String pseudo;
	

	@Column(length = 10)
	private int numeroTel;
	
	
	private Integer typeAdmin;
	
	
	
	
	
	@ManyToOne
	private Adresse adresse;
	
	@OneToMany(mappedBy="utilisateur")
	private List<Photo> photos;
	
	@ManyToOne
	private Apparence apparence;
	
	@ManyToMany
	private List<CentreInteret> centreInterets;
	
	@ManyToOne
	private Multimedia multimedia;
	
	@ManyToOne
	private Situation situation;
	
	@ManyToMany
	private List<Utilisateur> favoris;
	
	
	
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public Sexe getSexe() {
		return sexe;
	}
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public int getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}
	public Integer getTypeAdmin() {
		return typeAdmin;
	}
	public void setTypeAdmin(Integer typeAdmin) {
		this.typeAdmin = typeAdmin;
	}
	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}
	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}



	
	
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	public Apparence getApparence() {
		return apparence;
	}
	public void setApparence(Apparence apparence) {
		this.apparence = apparence;
	}
	public List<CentreInteret> getCentreInterets() {
		return centreInterets;
	}
	public void setCentreInterets(List<CentreInteret> centreInterets) {
		this.centreInterets = centreInterets;
	}
	public Multimedia getMultimedia() {
		return multimedia;
	}
	public void setMultimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}
	public Situation getSituation() {
		return situation;
	}
	public void setSituation(Situation situation) {
		this.situation = situation;
	}
	public List<Utilisateur> getFavoris() {
		return favoris;
	}
	public void setFavoris(List<Utilisateur> favoris) {
		this.favoris = favoris;
	}
	public Utilisateur(String emailUtilisateur, String nom, String prenom, String dateDeNaissance, Sexe sexe,
			String motDePasse, String description, String pseudo, int numeroTel, int type) {
		super();
		this.emailUtilisateur = emailUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.sexe = sexe;
		this.motDePasse = motDePasse;
		this.description = description;
		this.pseudo = pseudo;
		this.numeroTel = numeroTel;
		this.typeAdmin = type;
	}



	public Utilisateur() {}

}
