package com.phuocnguyen008.Object;

public class Main {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("PhuocNguyen");

		Object per = new Person();
		System.out.println(per.getClass());

		// Object is called master class in all class, with this case, per has type data
		// is Object
		// And point to sub class, in this case, is Person
	}
}
