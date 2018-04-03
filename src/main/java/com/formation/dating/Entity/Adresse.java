package com.formation.dating.Entity;

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
	
	@NotBlank
	@Pattern(regexp = "[0-9]{5}", message = "n'\'oubliez pas d'\'entrer votre code postal")
	@Column(name="codePostal", length=5)
	private int CodePostal;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- ]{1,45}", message = "{Veuillez ajouter votre ville}")
	@Column(length = 50)
	private String ville;
	
	@NotBlank
	@Column(length = 5)
	private int numero;
	
	@NotNull(message = "Message d'\'erreur")
	@Enumerated(EnumType.STRING)
	@Column(length = 8)
	private TypeRue typeRue;
	
	@NotBlank
	@Pattern(regexp = "(?i)[a-z- ]{1,10}", message = "{Veuillez remplir le complement}")
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
	public int getCodePostal() {
		return CodePostal;
	}
	public void setCodePostal(int codePostal) {
		CodePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public TypeRue getTypeRue() {
		return typeRue;
	}
	public void setTypeRue(TypeRue typeRue) {
		this.typeRue = typeRue;
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




	
	public Adresse(Long id, @NotBlank int codePostal, @NotBlank String ville, @NotBlank int numero,
		@NotBlank TypeRue typeRue, String complement, Prefixe prefixe) {
	super();
	this.id = id;
	CodePostal = codePostal;
	this.ville = ville;
	this.numero = numero;
	this.typeRue = typeRue;
	this.complement = complement;
	this.prefixe = prefixe;
}


	public Adresse() {
		
		utilisateurs = new ArrayList<>();
	}
	

}

