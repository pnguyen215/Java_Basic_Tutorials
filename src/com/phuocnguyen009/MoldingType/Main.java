package com.phuocnguyen009.MoldingType;

public class Main {
	public static void main(String[] args) {

		Worker worker = new Worker();
		Employee employee = new Worker();
		Person person = new Employee();

		Employee emp = (Worker) employee; // is called molding type
		emp.getClass();
		Person per = (Employee) person; // is called molding type
		System.out.println(per.hashCode());
		worker.Annouce();

		// When molding type then: type data of variable molded-type(declared) must be
		// master class and
		// Data type of variable is molded-type should be sub class and binding data
		// type is molding.

	}
}
