package com.formation.dating.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entities.Multimedia;
@Repository
public interface MultimediaRepository extends JpaRepository<Multimedia, Long>{

}
