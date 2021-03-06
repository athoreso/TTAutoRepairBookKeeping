package people;

import java.util.ArrayList;

import misc.Address;

public class Customer {

	private String name;
	
	private Address address;
	
	private String workNumber;
	
	private String cellNumber;

	private String homeNumber;
	
	private ArrayList<Person> people;
	
	public Customer() {
		
		this.name = null;
		
		this.address = null;
		
		this.workNumber = null;
		
		this.cellNumber = null;
		
		this.homeNumber = null;
		
		this.people = new ArrayList<Person>();
		
	}
	
	public Customer(String name, Address address, String workNumber, String cellNumber, String homeNumber) {
		
		this.name = name;
		
		this.address = address;
		
		this.workNumber = workNumber;
		
		this.cellNumber = cellNumber;
		
		this.homeNumber = homeNumber;
		
		this.people = new ArrayList<Person>();
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}
	
	public void setCellNumber(String cellNumber) {
		this.cellNumber =cellNumber;
	}
	
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	
	public void addPerson(Person person) {
		people.add(person);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(name + "\n");
		sb.append(cellNumber + "\n");
		sb.append(address.toString() + "\n");

		return sb.toString();
	}

}
