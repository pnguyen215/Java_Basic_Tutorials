package com.phuocnguyen019.InnerStaticClass;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		Person.Employee person = new Person.Employee();
		person.setName("PhuocNguyen");
		person.setAge(21);
		System.out.println(person.toString());

		Worker worker = new Worker();

		worker.setName("DavidNguyen");
		worker.setAge(21);
		System.out.println(worker.toString());
	}

}
