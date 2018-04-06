package com.formation.dating.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entities.Apparence;
@Repository
public interface ApparenceRepository extends JpaRepository<Apparence, Long>{

}
