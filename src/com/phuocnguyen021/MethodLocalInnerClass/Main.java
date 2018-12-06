package com.phuocnguyen021.MethodLocalInnerClass;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		Person person = new Person();
		person.printOut();

		person.setId(01);
		person.setName("David");
		person.setAge(21);
		System.out.println(person.toString());
	}

}
