package com.phuocnguyen012.MethodAbstract;

public abstract class Worker extends Person {

	private static final long serialVersionUID = 1L;

	@Override
	public void Announce() {
		System.out.println("This is sub class of Worker!");
	}
	/*
	 * Two abstract class can use extends each together. To use this abstract class,
	 * you need to create a class, extends this class
	 */
}
