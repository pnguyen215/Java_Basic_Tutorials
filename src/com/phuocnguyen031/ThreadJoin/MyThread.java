package com.phuocnguyen031.ThreadJoin;

public class MyThread extends Thread {

	public MyThread() {
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500); // after 0.5 s
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(this.getName() + " " + i);
		}
	}
}
