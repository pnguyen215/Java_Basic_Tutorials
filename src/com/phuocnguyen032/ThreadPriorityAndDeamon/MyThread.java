package com.phuocnguyen032.ThreadPriorityAndDeamon;

public class MyThread extends Thread {

	public MyThread() {
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(this.getName() + " " + i);
		}
	}
}
