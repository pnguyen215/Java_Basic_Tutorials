package com.phuocnguyen014.Interface;

public class PersonServiceImplement implements PersonService {

	Person person = new Person("Phuoc", 21, "398 Le Van Luong"); /* create new object */

	@Override
	public String getAddress() {
		return person.getAddress();
	}

	@Override
	public int getAge() {
		return person.getAge();
	}

	@Override
	public String getFullInformation() {
		return "Name: " + getName() + ", " + "Age: " + getAge() + ", " + "Address: " + getAddress();
	}

	@Override
	public String getName() {
		return person.getName();
	}
	/*
	 * To use interface class, we using keyword "implements" by created new class
	 */
}
