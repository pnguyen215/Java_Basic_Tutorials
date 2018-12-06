package com.phuocnguyen021.MethodLocalInnerClass;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private int id;

	public void printOut() {
		// Worker class is called method-local inner class ,
		// We declared method-local inner class into method of public class (printOut)
		class Worker {
			private String name;
			private int age;

			// This is constructor
			@SuppressWarnings("unused")
			public Worker() {
				super();
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

			public Worker(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}

			@Override
			public String toString() {
				return "Name: " + getName() + " " + "Age: " + getAge();
			}
		}
		Worker worker = new Worker("PhuocNguyen", 21);
		worker.setName("Worker");
		worker.setAge(54);
		Worker worker2 = new Worker("PhuocNguyen", 21);
		System.out.println(worker.toString() + worker2.toString());
	}

	public Person() {
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
}
