package com.phuocnguyen028.Enum;

public enum MyEnum {

	NAME("PhuocNguyen"), MIDNAME("Huu"), AGE(), ADDRESS;
	private String name;
	private int age;
	private String address;

	private MyEnum() {
	}

	private MyEnum(String name) {
		this.name = name;
	}

	private MyEnum(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private MyEnum(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + " " + "Age: " + getAge() + " " + "Address: " + getAddress();
	}
	/*
	 * in enum, any constructor is private access
	 */
}
