package com.phuocnguyen026.ThrowThrowsException;

public class HandleThrowsException {

	public HandleThrowsException() {
	}

	public void howThrow() throws ArrayIndexOutOfBoundsException {
		int[] array = { 1, 2 };
		System.out.println(array[1]);
	}

	public void throughNewException() {
		throw new ArrayIndexOutOfBoundsException("Say: I am an error");
	}
}
