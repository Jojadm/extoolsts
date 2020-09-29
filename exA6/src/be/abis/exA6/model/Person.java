package be.abis.exA6.model;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private int personNumber;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Company company = new Company();
	
	public Person(int PersonNumber, String firstName, String lastName, LocalDate birthDate, Company company) {
		// TODO Auto-generated constructor stub
		this.personNumber = PersonNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.company = company;
	}
	
	
	public Person(int personNumber, String firstName, String lastName, LocalDate birthDate) {
		// TODO Auto-generated constructor stub
		this(personNumber, firstName, lastName, birthDate, null);
	}

	public int getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public int calculateAge() {
		Period period = Period.between(this.birthDate, LocalDate.now());
		return period.getYears();
	}
	
	public String toString() {
		String data;
		if (this.company == null) {
			data = "Person " + this.getPersonNumber() + ": " +this.getFirstName() + " " + this.getLastName() + " (" +calculateAge() + "years old) is not employed for the moment"; 
 		} else { 
			data = "Person " +this.getPersonNumber() + ": " +this.getFirstName()+ " " + this.getLastName() + " (" +calculateAge() + "years old) works for " +this.company.getName() + " in " +this.company.getAddress().getTown();
		}
		return data;
	}
}
