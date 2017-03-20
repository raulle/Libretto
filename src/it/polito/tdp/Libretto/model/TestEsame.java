package it.polito.tdp.Libretto.model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {

		Esame tdp = new Esame("03FYZ","tecniche prog.","Fulvio Corno");
		System.out.println(tdp);
		Esame ami = new Esame("01QZP","ambient intelligence", "Fulvio Corno");
		System.out.println(ami);
		System.out.println(tdp.equals(ami));
		tdp.supera(30, LocalDate.now());
		System.out.println(tdp);
		tdp.supera(18, LocalDate.now());
		System.out.println(tdp);

	}

}
