package com.phuocnguyen010.InstanceOf;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee();
		Person person = new Person();

		Person person2 = new Employee();
		Employee worker = new Worker();

		if (employee instanceof Person) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (person2 instanceof Employee) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (person instanceof Employee) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (worker instanceof Employee) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		// We using "instance-of" check object and return value is true or false
	}

}
