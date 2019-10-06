package com.phuocnguyen002.ArrayObject;

import java.util.Scanner;

public class EmployeeMain {

	private static Scanner scanner;

	public static void main(String[] args) {
		/*
		 * declared object
		 */
		Employee[] employees = new Employee[1]; // number employees is 1
		/*
		 * declared variables
		 */
		scanner = new Scanner(System.in);
		String name;
		String address;
		int age;
		/*
		 * enter value for object
		 */
		for (int i = 0; i < employees.length; i++) {
			name = scanner.nextLine();
			address = scanner.nextLine();
			age = scanner.nextInt();
			employees[i] = new Employee(name, address, age);
			scanner.nextLine(); // delete bound store
		}
		/*
		 * print out
		 */
		for (Employee e : employees) {
			System.out.println(e.toString());
		}
	}

}
