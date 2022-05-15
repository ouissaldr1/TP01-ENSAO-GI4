package com.ensa.gi4.datatabase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ensa.gi4.modele.*;


@Component
public class Factory {
	
	private List<Materiel> materialList = new ArrayList<>();
	
	public Factory() {
		
	Chaise chaise1 = new Chaise();
	chaise1.setName("chaise1");
	chaise1.setId(1);
	
	Chaise chaise2 = new Chaise();
	chaise2.setName("chaise2");
	chaise2.setId(2);
	
	Chaise chaise3 = new Chaise();
	chaise3.setName("chaise3");
	chaise3.setId(3);
	
	Livre livre1= new Livre();
	livre1.setId(4);
	livre1.setName("livre1");
	
	Livre livre2= new Livre();
	livre2.setId(4);
	livre2.setName("livre2");
	
	Livre livre3= new Livre();
	livre3.setId(4);
	livre3.setName("livre3");
	
		
	materialList.add(chaise1);
	materialList.add(chaise2);
	materialList.add(chaise3);
	materialList.add(livre1);
	materialList.add(livre2);
	materialList.add(livre3);





	
	}
	
	public List<Materiel> getListMateriel(){
		return materialList;
	}
	
	public void setListMateriel(List<Materiel> materialList) {
		this.materialList = materialList;
		
	}

}
