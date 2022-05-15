package com.ensa.gi4.service.impl;


import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ensa.gi4.datatabase.Factory;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;

import com.ensa.gi4.service.api.GestionMaterielService;

import java.util.List;
import java.util.Scanner;

@Component 
public class GestionMaterielServiceImpl implements GestionMaterielService {
	@Autowired
	private Factory factory;
	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	private int n= 0;
	 
	 /* public GestionMaterielServiceImpl(Factory factory) {
		this.factory=factory;
	}*/
	
    // bd goes here
    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerMateriel() {
    	
    	List<Materiel> mat =  factory.getListMateriel();
    	
    	for(Materiel m: mat){
    		System.out.println(m.getName());
    		  		
    		
    	}
    	   	
    }
 @Override
    public void ajouterNouveauMateriel() {
        // Ã  complÃ©ter
    	
    	Materiel materiel;
 	   List<Materiel> list = factory.getListMateriel();
 	   System.out.println("voulez vous ajouter une chaise ou un livre? ");
 	   Scanner scanner = new Scanner(System.in);
        String monMateriel = scanner.next();
        if( monMateriel.equals("chaise")) {
     	   materiel = new Chaise();
     	   System.out.println("le nom : ");
            String name = scanner.next();

    		materiel.setName(name);
    		materiel.setId(n++);
            list.add(materiel);
            factory.setListMateriel(list);
     	   
       }
        else if( monMateriel.equals("livre")) {
     	   materiel = new Livre();
     	   System.out.println("le nom : ");
            String name = scanner.next();

    		materiel.setName(name);
    		materiel.setId(n++);
            list.add(materiel);
            factory.setListMateriel(list);
     	   
       }
        
        else {
     	   System.out.println("choix invalide");
        }
   }
    	
    	
    	
}

