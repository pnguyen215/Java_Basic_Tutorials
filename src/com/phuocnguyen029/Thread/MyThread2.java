package com.phuocnguyen029.Thread;

public class MyThread2 extends Thread {

	public MyThread2() {
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("B =" + i);
		}
	}
}
