package com.formation.dating.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entities.Photo;


@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long>{

}
