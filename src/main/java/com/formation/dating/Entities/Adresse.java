package com.formation.dating.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.formation.dating.Enum.Prefixe;
import com.formation.dating.Enum.TypeRue;

@Entity
public class Adresse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	
	private int num;

	//@Column(length=5)
	private int CodePostal;
	
	
	@Pattern(regexp = "(?i)[a-z- ]{1,45}", message = "{Veuillez ajouter votre ville}")
	@Column(length = 50)
	private String ville;
	
	
	@NotBlank
	private String nom;
	
	@NotNull(message = "Message d'\'erreur")
	@Enumerated(EnumType.STRING)
	@Column(length = 8)
	private TypeRue typeRue;
	
	
	@Pattern(regexp = "[a-z0-9  à-ÿ]{1,100}", message = "{Veuillez remplir le complement}")
	private String complement;
	
	
	private Prefixe prefixe;
	
	
	
	
	
	
	
	@OneToMany(mappedBy="adresse")
	private List<Utilisateur> utilisateurs;
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	public TypeRue getTypeRue() {
		return typeRue;
	}
	public void setTypeRue(TypeRue typeRue) {
		this.typeRue = typeRue;
	}
	public int getCodePostal() {
		return CodePostal;
	}
	public void setCodePostal(int codePostal) {
		CodePostal = codePostal;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public Prefixe getPrefixe() {
		return prefixe;
	}
	public void setPrefixe(Prefixe prefixe) {
		this.prefixe = prefixe;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	

	public Adresse(Long id, int num, int codePostal,
			@Pattern(regexp = "(?i)[a-z- ]{1,45}", message = "{Veuillez ajouter votre ville}") String ville,
			@NotBlank String nom, @NotNull(message = "Message d''erreur") TypeRue typeRue,
			@Pattern(regexp = "[a-z0-9  à-ÿ]{1,100}", message = "{Veuillez remplir le complement}") String complement,
			Prefixe prefixe, List<Utilisateur> utilisateurs) {
		super();
		this.id = id;
		this.num = num;
		this.CodePostal = codePostal;
		this.ville = ville;
		this.nom = nom;
		this.typeRue = typeRue;
		this.complement = complement;
		this.prefixe = prefixe;
		this.utilisateurs = utilisateurs;
	}
	public Adresse() {
		
		utilisateurs = new ArrayList<>();
		
	}
	

}

