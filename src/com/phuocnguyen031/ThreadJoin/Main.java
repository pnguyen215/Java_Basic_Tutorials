package com.phuocnguyen031.ThreadJoin;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.setName("Thread01");

		MyThread myThread2 = new MyThread();
		myThread2.setName("Thread02");

		MyThread myThread3 = new MyThread();
		myThread3.setName("Thread03");

		myThread.start();
		try {
			myThread.join(); // join can run with seconds: join(1500) ~ 1.5 seconds
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		myThread2.start();
		myThread3.start();
	}
}
