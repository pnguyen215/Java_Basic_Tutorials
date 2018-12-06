package com.phuocnguyen011.AbstractClass;

public class Main {

	public static void main(String[] args) {

		// Person person1 = new Person();
		Employee employee = new Employee();
		employee.setName("PhuocNguyen");
		Person person = (Employee) employee; // polymorphism
		person.setAge(29);
		System.out.println(person.getAge() + " " + person.getName());
	}

}
