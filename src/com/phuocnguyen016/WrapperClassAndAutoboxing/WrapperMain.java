package com.phuocnguyen016.WrapperClassAndAutoboxing;

public class WrapperMain {

	public static void main(String[] args) {

		int a = 10;
		Integer b = new Integer(10); // This is Wrapper
		int c = a + b; // This is auto-boxing, in this case, is Un-boxing, transform Integer to "int"
		System.out.println(c);
		int d = Integer.valueOf("45"); // case 1: Using convert data type from String to int
		System.out.println(d);
		int e = Integer.parseInt("56"); // case 2: Using convert data type from String to int
		System.out.println(e);
		double f = Double.parseDouble("12.5");
		System.out.println(f);

		Integer g = 5; // This is boxing, transform int to Integer
		// Similar to create new object
		g = new Integer(10);
		int h = 10;
		System.out.println(g == h);

		Integer i = new Integer(20);// This is object on heap is i
		Integer k = new Integer(20);// This is object on heap is k, i is different k!
		System.out.println(i == k);
		// To compare 2 object, we using equals
		System.out.println(i.equals(k));
	}

}
