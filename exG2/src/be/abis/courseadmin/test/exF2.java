package be.abis.courseadmin.test;

import java.io.IOException;


import be.abis.courseadmin.model.Course;
import be.abis.courseadmin.model.Instructor;

public class exF2 {

	public static void main(String[] args)  {
		
		
		Course co1 = new Course("Java", 2, 300, false);
		Instructor instr1a = new Instructor ("Donald", "Duck", 45, 20, 17500.0);
		Instructor instr1b = new Instructor ("Daisy", "Duck", 44, 28, 1800.0);
		co1.addInstructor(instr1a);
		co1.addInstructor(instr1b);
		
		
		Course co2 = new Course("Java", 2, 300, false);
		Instructor instr2a = new Instructor ("Sandy", "Schillebeeckx", 38, 25, 1700.0);
		Instructor instr2b = new Instructor ("Sonja", "De Meersman", 45, 32, 1600.0);
		co2.addInstructor(instr2a);
		co2.addInstructor(instr2b);
	
		Course[] courses = { co1, co2};

		try {
			for (Course c : courses) {
				c.printInfo();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
}