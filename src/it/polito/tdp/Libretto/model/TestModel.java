package it.polito.tdp.Libretto.model;

public class TestModel {

	public static void main(String[] args) {

		Model m = new Model();
		System.out.println(m.addEsame(new Esame("03FYZ","tecniche prog.","Fulvio Corno")));
		System.out.println(m.addEsame(new Esame("01QZP","ambient intelligence", "Fulvio Corno")));
		System.out.println(m.addEsame(new Esame("03FYZ","tecniche prog.","Fulvio Corno")));
		
		System.out.println(m.trovaEsame("03FYZ"));
		System.out.println(m.trovaEsame("01QZP"));
		System.out.println(m.trovaEsame("09EEE"));
	
	}

}
