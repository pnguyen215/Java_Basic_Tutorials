package com.phuocnguyen011.AbstractClass;

import java.io.Serializable;

public abstract class Person implements Serializable {
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
	// Abstract class, we can not create new object from corporal abstract class
	// Abstract class is master class, so if you want use it, we create one's class
	// and after that extends it
}
