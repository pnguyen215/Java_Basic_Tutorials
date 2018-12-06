package com.phuocnguyen029.Thread;

public class MyThread1 implements Runnable {

	public MyThread1() {
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("A =" + i);
		}
	}

}
