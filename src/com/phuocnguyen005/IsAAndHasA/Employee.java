package com.phuocnguyen005.IsAAndHasA;

import java.io.Serializable;

public class Employee extends Person implements Serializable {

	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}

	// Now, Employee "Is A" Person
}
