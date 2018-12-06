package com.phuocnguyen029.Thread;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		MyThread1 myThread1 = new MyThread1();
		Thread thread1 = new Thread(myThread1);

		MyThread2 myThread2 = new MyThread2();

		thread1.start();
		myThread2.start();
	}

}
