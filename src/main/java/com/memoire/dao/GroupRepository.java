package com.memoire.dao;

import com.memoire.entity.Groupe;
import com.memoire.entity.Role;
import com.memoire.entity.Sujet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Groupe, String> {
   public Groupe findByIdGrp(String idGrp);


}
