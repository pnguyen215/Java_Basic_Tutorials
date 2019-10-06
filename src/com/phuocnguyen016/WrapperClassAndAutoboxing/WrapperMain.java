package com.phuocnguyen016.WrapperClassAndAutoboxing;

public class WrapperMain {

	public static void main(String[] args) {
		/* 1. Auto boxing: including 2 type: Boxing and Un-boxing */
		/*
		 *
		 * Boxing is convert from basic data type to object type. Un-boxing is convert
		 * from object data type to basic data type
		 */

		/*
		 * Example about Un-boxing
		 */
		int a = 10;
		Integer b = new Integer(10); /* This is Wrapper */
		int c = a + b; // This is auto-boxing, in this case is Un-boxing: convert Integer to "int"
		System.out.println(c);

		/*
		 * There are two way in Un-boxing, convert object data type to basic data type
		 */

		/* case 1: Using convert data type from String to int */
		int d = Integer.valueOf("45");
		System.out.println(d);
		/* case 2: Using convert data type from String to int */
		int e = Integer.parseInt("56");
		System.out.println(e);
		double f = Double.parseDouble("12.5");
		System.out.println(f);

		/*
		 * Example about Boxing
		 */

		Integer g = 5; /* This is boxing, convert int to Integer, similar to g = new Integer(10); */
		g = new Integer(10);
		int h = 10;
		System.out.println(g == h); // true

		/*
		 * Compare two objects each together
		 */

		Integer i = new Integer(20);
		Integer k = new Integer(20);
		System.out.println(i == k); // false

		/*
		 * To compare 2 object, we using equals
		 */

		System.out.println(i.equals(k)); // true
		/*
		 * Explain: new Integer(20) [this is new object] is saved on Heap memory, i and
		 * k is saved on Stack memory
		 */
	}

}
