package be.abis.exA6.model;

public class Company {
	private String name;
	private Address address = new Address();
	
	public Company(String name, Address a1) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = a1;
	}
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
