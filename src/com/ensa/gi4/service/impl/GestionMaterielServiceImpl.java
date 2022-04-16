package com.ensa.gi4.service.impl;

import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;
import org.springframework.stereotype.Component;

@Component("materielService")
public class GestionMaterielServiceImpl implements GestionMaterielService {
    // bd goes here
    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerMateriel() {
        System.out.println("Liste de matériel :\n 3 Livres \n 4 chaises");
    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {
        // à compléter
        System.out.println("L'ajout du matériel " + materiel.getName() + " effectué avec succès !");
    }
}
