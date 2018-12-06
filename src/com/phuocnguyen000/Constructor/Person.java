package com.phuocnguyen000.Constructor;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Person() { // this is constructor
	}

	public Person(String name, int age) {// this is constructor
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + " " + "Age: " + getAge();
	}
}
