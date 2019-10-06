package com.phuocnguyen019.InnerStaticClass;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	// Employee class is called "inner static class"
	// Access manage can: public / private/ protected / default
	public static class Employee {

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

}
