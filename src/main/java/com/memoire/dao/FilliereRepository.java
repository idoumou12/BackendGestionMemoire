package com.memoire.dao;

import com.memoire.entity.Fichier;
import com.memoire.entity.Filliere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilliereRepository extends JpaRepository<Filliere, Long> {
    public Filliere findByIdfilliere(Long idfilliere);
}
