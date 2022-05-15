package com.ensa.gi4.service.api;

import org.springframework.stereotype.Component;

import com.ensa.gi4.modele.Materiel;
@Component
public interface GestionMaterielService {
    void init();
    void listerMateriel();
    void ajouterNouveauMateriel();
}
