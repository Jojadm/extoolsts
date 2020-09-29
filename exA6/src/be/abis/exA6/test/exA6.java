package be.abis.exA6.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import be.abis.exA6.model.Address;
import be.abis.exA6.model.Company;
import be.abis.exA6.model.Person;

public class exA6 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthDate;
		int number= 1;
		birthDate = LocalDate.parse("21/12/1974", format); 
		Person p1 = new Person(number, "Sonja", "De Meersman", birthDate);
		number += 1;
		birthDate = LocalDate.parse("19/08/1975", format); 
		Address a1 = new Address ("Broekstraat", "1", "1000", "Brussel", "België", "BE");
		Company c1 = new Company ("Fortis", a1);
		Person p2 = new Person(number, "Donald", "Duck", birthDate, c1);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}
