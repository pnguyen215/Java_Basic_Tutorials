package com.phuocnguyen022.AnonymousInnerClass;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		PersonService personService = new PersonService() {

			@Override
			public String announce() {
				return "I am method of interface Class";
			}
		};
		System.out.println(personService.announce());
		PersonAbstract personAbstract = new PersonAbstract() {

			@Override
			public String getName() {
				return "I am method from abstract class!";
			}
		};
		System.out.println(personAbstract.getName());
	}

}
