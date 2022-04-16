package com.ensa.gi4;

import com.ensa.gi4.controller.GestionMaterielController;
import com.ensa.gi4.service.api.GestionMaterielService;
import com.ensa.gi4.service.impl.GestionLivreServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {
    @Value("")
    private String x;


    public @Bean String u (){
        return "";
    }
    @Bean
    public GestionMaterielService livreServiceBean(String x){
        return new GestionLivreServiceImpl();
    }
    @Bean
    @Lazy
    public GestionMaterielController gestionMaterielControllerBean(GestionMaterielService livreServiceBean){
        return new GestionMaterielController(livreServiceBean);
    }
}
