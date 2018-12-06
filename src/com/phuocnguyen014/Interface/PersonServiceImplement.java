package com.phuocnguyen014.Interface;

public class PersonServiceImplement implements PersonService {

	Person person = new Person("Phuoc", 21, "398 Le Van Luong");

	@Override
	public String getName() {
		return person.getName();
	}

	@Override
	public int getAge() {
		return person.getAge();
	}

	@Override
	public String getAddress() {
		return person.getAddress();
	}

	@Override
	public String getFullInformation() {
		return "Name: " + getName() + ", " + "Age: " + getAge() + ", " + "Address: " + getAddress();
	}

}

// To use interface, we using keyword "implements" by create new class 
