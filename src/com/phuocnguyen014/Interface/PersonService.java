package com.phuocnguyen014.Interface;

public interface PersonService {

	/*
	 * default is abstract
	 */
	public String getAddress(); /* public abstract String getAddress() */

	/*
	 * a lot of method no body on interface
	 */
	public abstract int getAge();

	public abstract String getFullInformation();

	public abstract String getName();

}
/*
 * All method in interface, is abstract with public access. All method no have
 * body. We can't declare instance variable or function instance!
 */
