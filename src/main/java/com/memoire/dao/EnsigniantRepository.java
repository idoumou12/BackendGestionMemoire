package com.memoire.dao;

import com.memoire.entity.Ensigniant;
import com.memoire.entity.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnsigniantRepository extends JpaRepository<Ensigniant, Long> {
    public Ensigniant findByNomEnseigniant(String nomEnseigniant);
}

