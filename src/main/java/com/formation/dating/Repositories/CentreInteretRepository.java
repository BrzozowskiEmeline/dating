package com.formation.dating.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entities.CentreInteret;
@Repository
public interface CentreInteretRepository extends JpaRepository<CentreInteret, Long> {

}
