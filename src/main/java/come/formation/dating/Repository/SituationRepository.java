package come.formation.dating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entity.Situation;


@Repository
public interface SituationRepository extends JpaRepository<Situation, Long>{

}
