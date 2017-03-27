package it.polito.tdp.Libretto.db;

import it.polito.tdp.Libretto.model.Esame;

public class TestEsameDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EsameDAO dao= new EsameDAO();
		
		Esame e1 = dao.find("03FYZ");
		System.out.println(e1);
		
		dao.create(new Esame("08JJJ","a","b"));
		
	}

}
