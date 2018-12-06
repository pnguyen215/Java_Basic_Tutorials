package com.phuocnguyen030.LifeCycleThread.Images;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		MyThread myThread1 = new MyThread("a");
		MyThread myThread2 = new MyThread("b");
		myThread1.start();
		myThread2.start();

	}

}
