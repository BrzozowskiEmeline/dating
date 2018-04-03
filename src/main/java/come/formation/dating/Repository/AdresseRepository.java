package come.formation.dating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.formation.dating.Entity.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long>{

}
