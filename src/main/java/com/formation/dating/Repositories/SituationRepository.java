package com.formation.dating.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entities.Situation;


@Repository
public interface SituationRepository extends JpaRepository<Situation, Long>{

}
