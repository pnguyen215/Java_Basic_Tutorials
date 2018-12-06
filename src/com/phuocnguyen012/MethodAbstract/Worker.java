package com.phuocnguyen012.MethodAbstract;

public abstract class Worker  extends Person {

	private static final long serialVersionUID = 1L;

	@Override
	public void Announce() {
		System.out.println("This is sub class of Worker!");
	}

}
