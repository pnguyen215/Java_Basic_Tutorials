package com.phuocnguyen004.SuperAndThis;

public class Employee extends Person {

	private static final long serialVersionUID = 1L;

	@Override
	public void Annouce() {
		super.Annouce(); // calling to father's class
		System.out.println("This is subclass's Employee!");

	}

}
