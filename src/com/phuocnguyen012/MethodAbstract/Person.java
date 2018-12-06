package com.phuocnguyen012.MethodAbstract;

import java.io.Serializable;

public abstract class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	public abstract void Announce();
}

// In abstract class, we declare "method" not body!
// To use Method in abstract class, we create one class and extends it. 
// After that, we will override method on abstract 
