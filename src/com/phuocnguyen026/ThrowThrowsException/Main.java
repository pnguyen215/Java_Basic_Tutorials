package com.phuocnguyen026.ThrowThrowsException;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		HandleThrowsException handleThrowsException = new HandleThrowsException();
		try {
			handleThrowsException.howThrow();
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
		try {
			handleThrowsException.throughNewException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
