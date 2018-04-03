package com.formation.dating.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String emailUtilisateur;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z]{2,50}", message = "{com.example.demo.annuaire.contraint.nom.message}")
	@Column(length = 30)
	private String nom;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z\\- à-ÿ]{2,100}", message = "{com.example.demo.annuaire.contraint.prenom.message}")
	@Column(length = 50)
	private String prenom;
	
	@NotBlank
	@DateTimeFormat
	@Column(columnDefinition="date", name="birthday", length=5 )
	private int dateDeNaissance;
	
	
	@NotNull(message = "Message d'\'erreur")
	@Enumerated(EnumType.STRING)
	@Column(length = 8)
	private String sexe;
	
	@NotNull(message = "N'oubliez pas votre Mot de passe")
	@Column(length =10)
	@Pattern(message = "{Le mot de passe ne dois pas dépasser 10 caractères}", regexp = "(?i)[a-z\\\\- à-ÿ]{2,10}")
	private String motDePasse;
	
	@NotNull(message = "Faite nous une petite descritpion ")
	@Column(length =500)
	private String description;
	
	@NotNull(message = "Attention un pseudo est recommandé ")
	@Column(length =500)
	private String pseudo;
	
	@Pattern(message = "{com.example.demo.annuaire.contraint.Tel.message}", regexp = "[0-9]{4,14}")
	@Column(length = 10)
	private int numeroTel;
	
	
	private Integer typeAdmin;
	
	
	
	@ManyToOne
	private Adresse adresse;
	
	@OneToMany(mappedBy=" Utilisateur")
	private List<Photo> photo;
	
	@ManyToOne
	private Apparence apparence;
	
	@ManyToOne
	private CentreInteret centreInteret;
	
	@ManyToOne
	private Multimedia multimedia;
	
	@ManyToOne
	private Situation situation;
	
	
	
	
	
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
	public int getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(int dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
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



	
	
	
	public Utilisateur(String emailUtilisateur, String nom, String prenom, int dateDeNaissance, String sexe,
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
