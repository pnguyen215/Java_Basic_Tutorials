package com.phuocnguyen025.FinallyException;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		int[] array = { 1, 2 };
		try {
			System.out.println(array[4]);
		} catch (Exception e) {
			System.out.println(e.getClass());
		} finally {
			System.out.println("Finally is always run!");
		}
	}

}
