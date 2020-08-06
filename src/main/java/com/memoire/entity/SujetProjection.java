package com.memoire.entity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "s1",types = Sujet.class)
public interface SujetProjection  {
//    @Query("select g from getGrp_propose g where g.idGrp !=null ")
    public Groupe getGrp_propose();
    public  String getTitreSujet();
    public  Ensigniant getEnsigniant();
    public Boolean getValider();
     public  String getEntreprice_acceuil();
}
