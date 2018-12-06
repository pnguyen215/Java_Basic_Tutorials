package com.phuocnguyen033.SynchronizationThread;

public class MyThread implements Runnable {

	private int sum = 0;

	public MyThread() {
		this.sum = 2000;
	}

	public synchronized void withdraw() throws InterruptedException {

		if (sum > 0) {
			Thread.sleep(1000);
			sum -= 1000;
			System.out.println(sum);
		} else {
			System.out.println("No moneys");
		}
	}

	@Override
	public void run() {
		try {
			withdraw();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
