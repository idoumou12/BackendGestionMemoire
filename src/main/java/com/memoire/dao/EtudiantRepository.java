package com.memoire.dao;

import com.memoire.entity.Etudiant;
import com.memoire.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, String> {
    public Etudiant findByNom(String nom);
}
