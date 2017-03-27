package it.polito.tdp.Libretto.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.Libretto.db.EsameDAO;

public class Model {
	
	private List<Esame> esami;
	
	public Model() {
		this.esami = new LinkedList<Esame>();
	}
	
	public boolean addEsame(Esame e) {
		EsameDAO dao = new EsameDAO();
		return dao.create(e);
	}
	
	public Esame trovaEsame(String codice){
		EsameDAO dao = new EsameDAO();
		return dao.find(codice);	
	}
}
