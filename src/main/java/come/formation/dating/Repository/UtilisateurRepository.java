package come.formation.dating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.dating.Entity.Utilisateur;



public interface UtilisateurRepository extends JpaRepository<Utilisateur, String> {

}
