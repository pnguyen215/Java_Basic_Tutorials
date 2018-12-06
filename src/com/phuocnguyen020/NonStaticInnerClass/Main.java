package com.phuocnguyen020.NonStaticInnerClass;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		Person person = new Person();

		Person.Employee employee = person.new Employee("PhuocNguyen", 21);
		System.out.println(employee.toString());

		person.setId(1);
		person.setName("DavidNguyen");
		person.setAge(21);
		System.out.println(person.toString());

		Person.Worker worker = person.new Worker();
		System.out.println(worker.getClass());
	}

}
