package com.phuocnguyen024.TryCatchToException;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		int[] array = { 1, 2 };
		try {

			System.out.println(array[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Finish!");
	}

}
