/**
 * 
 */
package com.phuocnguyen018.OuterClass;

/**
 * @author David Nguyen
 *
 */
public class Main {
	public Main() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.printfOuterClass();
		System.out.println();
		Person person = new Person();
		person.testOuterClass();
		System.out.println();
		Worker worker = new Worker();
		worker.printfOuterClass();

	}

}
