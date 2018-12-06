package com.phuocnguyen007.Polymorphism;

import java.io.Serializable;

public class Notice implements Serializable {

	private static final long serialVersionUID = 1L;
	private String notices;

	public Notice(String notices) {
		super();
		this.notices = notices;
	}

	public String getNotices() {
		return notices;
	}

	public void setNotices(String notices) {
		this.notices = notices;
	}
	
	public void Annoce() {
		System.out.println("This is master class!");
	}
}
