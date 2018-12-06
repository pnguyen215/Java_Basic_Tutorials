package com.phuocnguyen030.LifeCycleThread.Images;

public class MyThread extends Thread {

	public MyThread() {
	}

	private String nameThread;

	public String getNameThread() {
		return nameThread;
	}

	public void setNameThread(String nameThread) {
		this.nameThread = nameThread;
	}

	public MyThread(String nameThread) {
		super();
		this.nameThread = nameThread;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000); // thread go to sleep after 1 second
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(this.getNameThread() + " " + i);

		}
	}
}
