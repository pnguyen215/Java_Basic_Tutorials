package com.phuocnguyen021.MethodLocalInnerClass;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private int id;

	public Person() {
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

	public void printOut() {
		// Worker class is called method-local inner class ,
		// We declared method-local inner class into method of public class (printOut)
		class Worker {
			private String name;
			private int age;

			public Worker(String name, int age) {
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
		Worker worker = new Worker("PhuocNguyen", 21);
		worker.setName("Worker");
		worker.setAge(54);
		Worker worker2 = new Worker("PhuocNguyen", 21);
		System.out.println(worker.toString() + " " + worker2.toString());
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
