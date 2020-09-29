package be.abis.exA6.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import be.abis.exA6.model.Address;
import be.abis.exA6.model.Company;
import be.abis.exA6.model.Person;

public class exA6 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<Person> persons = new ArrayList<Person>();
		int number = 1;
		Person p1 = new Person(number, "Sonja", "De Meersman", LocalDate.of(1974, 12, 21));
		number += 1;
		Address a1 = new Address("Broekstraat", "1", "1000", "Brussel", "België", "BE");
		Company c1 = new Company("Fortis", a1);
		Person p2 = new Person(number, "Donald", "Duck", LocalDate.of(1975, 12, 21), c1);
		persons.add(p1);
		persons.add(p2);
		
		List<String> printLines = new ArrayList<String>();
		for (Person p : persons) {
			System.out.println(p);
			printLines.add(p.toString());
		}
		
		try {
			writeToFile(printLines);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeToFile(List<String> printLines) throws IOException {
		// TODO Auto-generated method stub
		Path pathToFile = Paths.get("personinfo.txt");
		BufferedWriter writer = Files.newBufferedWriter(pathToFile);
		for (String line : printLines) {
			System.out.println("Printing: " + line);
			writer.write(line);
			writer.newLine();
		}
		writer.close();
	}

}
