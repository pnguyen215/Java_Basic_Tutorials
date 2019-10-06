package com.phuocnguyen012.MethodAbstract;

public class Employee extends Person {

	private static final long serialVersionUID = 1L;

	@Override
	public void Announce() {
		System.out.println("This is sub class of Employee!");
	}
	/*
	 * An other class normal, "extends" it and override method on abstract class
	 */

}
