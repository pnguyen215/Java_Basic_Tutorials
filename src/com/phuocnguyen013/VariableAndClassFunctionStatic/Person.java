package com.phuocnguyen013.VariableAndClassFunctionStatic;

public class Person {
	static String name;
	static int age;

	public static int area(int width, int lenght) {
		return (int) (0.5 * width * lenght);
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Person.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Person.age = age;
	}

	public static void main(String[] args) {
		Person.name = "PhuocNguyen";
		Person.setName("David");
		System.out.println(Person.getName());
		System.out.println(Person.area(12, 12));

	}

}
// For variable or method, is static or class, we do not need create new object,
// to access by using class name and point to attribute we want to use.
// 