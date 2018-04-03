package come.formation.dating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entity.CentreInteret;
@Repository
public interface CentreInteretRepository extends JpaRepository<CentreInteret, Long> {

}
