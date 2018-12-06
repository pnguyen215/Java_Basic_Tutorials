package com.phuocnguyen002.ArrayObject;

import java.util.Scanner;

public class EmployeeMain {

	private static Scanner scanner;

	public static void main(String[] args) {

		Employee[] employees = new Employee[1];
		scanner = new Scanner(System.in);
		String name;
		String address;
		int age;
		for (int i = 0; i < employees.length; i++) {
			name = scanner.nextLine();
			address = scanner.nextLine();
			age = scanner.nextInt();
			employees[i] = new Employee(name, address, age);
			scanner.nextLine();
		}
		for (Employee e : employees) {
			System.out.println(e.toString());
		}
	}

}
