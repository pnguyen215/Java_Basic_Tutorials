package com.phuocnguyen011.AbstractClass;

public class Main {

	public static void main(String[] args) {

		/*
		 * Person person1 = new Person(); Person class is abstract class, so then we
		 * don't create new object from this
		 */
		Employee employee = new Employee();
		employee.setName("PhuocNguyen");
		Person person = employee; /* Polymorphism */
		person.setAge(29);
		System.out.println(person.getAge() + " " + person.getName());
	}
	/*
	 *
	 */

}
