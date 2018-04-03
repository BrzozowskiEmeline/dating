package com.formation.dating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entity.Photo;


@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long>{

}
