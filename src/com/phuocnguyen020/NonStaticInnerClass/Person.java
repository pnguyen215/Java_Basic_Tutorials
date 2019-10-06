package com.phuocnguyen020.NonStaticInnerClass;

import java.io.Serializable;

public class Person implements Serializable {

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

		public int getAge() {
			return age;
		}

		public String getName() {
			return name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Name: " + getName() + " " + "Age: " + getAge();
		}
	}

	public class Worker extends Employee {

	}

	/*
	 * we can extends non inner class inside this class, example Worker extends
	 * Employee. Out-side class we can't extends this non inner class
	 *
	 */
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

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + " " + "Name: " + getName() + " " + "Age: " + getAge();
	}
}
