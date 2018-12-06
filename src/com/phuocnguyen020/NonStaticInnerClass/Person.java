package com.phuocnguyen020.NonStaticInnerClass;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private int id;

	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + " " + "Name: " + getName() + " " + "Age: " + getAge();
	}

	// Employee class is called inner class or non static inner class
	// When declared inner class, we don't use keyword static
	public class Employee {

		private String name;
		private int age;

		public Employee() {
			super();
		}

		public Employee(String name, int age) {
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

	public class Worker extends Employee {

	}
}
