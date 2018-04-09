package com.formation.dating.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entities.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long>{



}
