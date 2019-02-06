package com.phuocnguyen014.Interface;

public interface PersonService {

	public abstract String getName();

	public abstract int getAge();

	public abstract String getFullInformation();

	/*
	 * default is abstract
	 */
	public String getAddress();

}
/*
 * All method in interface, is abstract with public access. All method no have
 * body
 */
