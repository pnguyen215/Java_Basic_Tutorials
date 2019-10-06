package com.phuocnguyen030.LifeCycleThread.Images;

public class MyThread extends Thread {

	private String nameThread;

	public MyThread() {
	}

	public MyThread(String nameThread) {
		super();
		this.nameThread = nameThread;
	}

	public String getNameThread() {
		return nameThread;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			/*
			 * block try ...catch to run after 1 second
			 */
			try {
				Thread.sleep(1000); // thread go to sleep after 1 second
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(this.getNameThread() + " " + i);

		}
	}

	public void setNameThread(String nameThread) {
		this.nameThread = nameThread;
	}
}
