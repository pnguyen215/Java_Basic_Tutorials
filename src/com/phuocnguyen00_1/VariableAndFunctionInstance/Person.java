package com.phuocnguyen00_1.VariableAndFunctionInstance;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name; // this is variable instance
	private int age; // this is variable instance

	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() { // this is function instance
		return name;
	}

	public void setName(String name) {// this is function instance
		this.name = name;
	}

	public int getAge() {// this is function instance
		return age;
	}

	public void setAge(int age) {// this is function instance
		this.age = age;
	}

}
