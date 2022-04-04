package com.ensa.gi4.datatabase.impl;

import com.ensa.gi4.datatabase.api.MaterielDao;

public class MaterielDaoImpl implements MaterielDao {
    private final ListMateriel listMateriel;

    MaterielDaoImpl(ListMateriel listMateriel) {
        this.listMateriel = listMateriel;
    }


    public void init() {
        System.out.println("post construct method");
    }
}
