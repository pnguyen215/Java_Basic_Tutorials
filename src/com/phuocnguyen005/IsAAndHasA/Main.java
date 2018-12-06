package com.phuocnguyen005.IsAAndHasA;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("PhuocNguyen");
		employee.setAge(22);
		employee.setAddress(new Address("398 Le Van Luong"));
		System.out.println(employee.toString());

		Address address = new Address("Phuoc Kien, Nha Be");
		Person person = new Person("PhuocNguyen", 22, address);
		System.out.println(person.toString());

	}

}
