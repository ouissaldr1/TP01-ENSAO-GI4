package com.ensa.gi4.datatabase.impl;

import com.ensa.gi4.datatabase.api.MaterielDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MaterielDaoImpl implements MaterielDao {
    private final ListMateriel listMateriel;

    @Autowired
    MaterielDaoImpl(ListMateriel listMateriel) {
        this.listMateriel = listMateriel;
    }


    public void init() {
        System.out.println("post construct method");
    }
}
