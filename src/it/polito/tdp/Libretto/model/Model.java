package it.polito.tdp.Libretto.model;

import java.util.LinkedList;
import java.util.List;

public class Model {
	
	private List<Esame> esami;
	
	public Model() {
		this.esami = new LinkedList<Esame>();
	}
	
	public boolean addEsame(Esame e) {
		if(!esami.contains(e)){
			esami.add(e);
			return true;
		}
		else
			return false;
	}
	
	public Esame trovaEsame(String codice){
		int pos = esami.indexOf(new Esame(codice,null,null));
		if(pos==-1)
			return null;
		else
			return esami.get(pos);	
	}
}
