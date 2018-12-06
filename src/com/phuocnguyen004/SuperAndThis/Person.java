package com.phuocnguyen004.SuperAndThis;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
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
		return "Name: " + getName() + ", " + "Age: " + getAge();
	}

	public void Annouce() {

		System.out.println("Name: " + getName() + ", " + "Age: " + getAge());
	}

}
