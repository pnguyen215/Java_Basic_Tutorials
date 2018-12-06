package com.phuocnguyen014.Interface;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		PersonServiceImplement personServiceImplement = new PersonServiceImplement();
		person.setName("PhuocNguyen");
		person.setAge(21);
		person.setAddress("398 Le Van Luong");
		System.out.println(person.getFullInformation());
		System.out.println(personServiceImplement.getFullInformation());
	}

}
