/**
 * 
 */
package com.phuocnguyen018.OuterClass;

/**
 * @author David Nguyen
 *
 */
public class Person {

	public Person() {

	}

	public void testOuterClass() {
		Employee employee = new Employee("PhuocNguyen", 21);
		System.out.println(employee.toString());
		System.out.print("Path: ");
		System.out.println(getClass());
	}

}

// Employee class is called outer-class
class Employee {

	private String name;
	private int age;

	public Employee() {

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
		return "Name: " + getName() + ", " + "Age: " + getAge();
	}

	public void printfOuterClass() {
		System.out.println("I'm a method in outer-class!");
		System.out.print("Path: ");
		System.out.println(getClass());
	}
}

// class Employee is called outer-class
// Outer-class is declared bellow | above public class
// Manage access of outer-class is default
// Any class in those package, extends outer-class
// In outer-class, you can create a lot of method: set, get, ... Or create
// constructors
