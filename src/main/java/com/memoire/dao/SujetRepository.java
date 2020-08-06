package com.memoire.dao;

import com.memoire.entity.Sujet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SujetRepository  extends JpaRepository<Sujet, String> {
    public Sujet findBytitreSujet(String titreSujet);
}
