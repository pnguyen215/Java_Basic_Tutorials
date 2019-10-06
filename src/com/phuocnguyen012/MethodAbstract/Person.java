package com.phuocnguyen012.MethodAbstract;

import java.io.Serializable;

public abstract class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	public abstract void Announce(); /* this's method no body, calling method abstract in abstract class */

	public void info() { // default access, we using it by override way when extends this abstract class
	}
	/*
	 * 1. In abstract class, we declare "method" not body! 2. To use Method in
	 * abstract class, we create one class and extends it. 3. After that, we will
	 * override method on abstract class.
	 */
}
