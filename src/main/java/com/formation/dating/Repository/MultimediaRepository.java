package com.formation.dating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.dating.Entity.Multimedia;
@Repository
public interface MultimediaRepository extends JpaRepository<Multimedia, Long>{

}
