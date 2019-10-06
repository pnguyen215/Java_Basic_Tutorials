package com.phuocnguyen032.ThreadPriorityAndDeamon;

public class Main {

	public static void main(String[] args) {

		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		MyThread myThread3 = new MyThread();
		myThread1.setName("A");
		myThread2.setName("B");
		myThread3.setName("C");

		myThread1.setPriority(1);
		myThread2.setPriority(10);
		myThread3.setPriority(5);

		// myThread1.start();
		myThread2.start();
		myThread3.start();
		System.out.println("myThread2: isAlive!" + myThread2.isAlive());
		myThread1.setDaemon(true); // when you setDeamon thread for myThread1, so then you need comment for
									// myThread1.start()
		System.out.println("myThread1: isAlive!" + myThread1.isAlive());
		System.out.println(myThread1.isDaemon()); // this myThread1 is running background
		System.out.println(myThread1.isInterrupted());

	}
	/*
	 * Threads in java are arranged in priority from 1 to 10. Depending on priority,
	 * the thread is run before or after. However, this does not guarantee this
	 * priority in practice.
	 */

}
