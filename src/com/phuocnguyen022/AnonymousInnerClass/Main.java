package com.phuocnguyen022.AnonymousInnerClass;

public class Main {

	public static void main(String[] args) {
		/*
		 * for interface class
		 */
		PersonService personService = new PersonService() { // calling it by Anonymous Inner Class

			@Override
			public String announce() {
				return "I am method of interface Class";
			}
		};
		System.out.println(personService.announce());
		/*
		 * for abstract class
		 */
		PersonAbstract personAbstract = new PersonAbstract() { // calling it by Anonymous Inner Class

			@Override
			public String getName() {
				return "I am method from abstract class!";
			}
		};
		System.out.println(personAbstract.getName());
	}

	public Main() {
	}

}
