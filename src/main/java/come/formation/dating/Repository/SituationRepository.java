package come.formation.dating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.dating.Entity.Situation;



public interface SituationRepository extends JpaRepository<Situation, Long>{

}
