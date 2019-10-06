package com.phuocnguyen027.CreateNewException;

public class Main {

	public static int dividedBy(int a, int b) throws MyException {
		int res;
		try {
			res = a / b;
			return res;
		} catch (Exception e) {
			throw new MyException("Error divided by 0!");
		}

	}

	public static void main(String[] args) {
		try {
			System.out.println(dividedBy(8, 0));
		} catch (MyException e) {
			System.out.println(e.getMessages());
		}
	}

}
