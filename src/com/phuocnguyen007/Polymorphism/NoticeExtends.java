package com.phuocnguyen007.Polymorphism;

import java.io.Serializable;

public class NoticeExtends extends Notice implements Serializable {



	public NoticeExtends(String notices) {
		super(notices);
	}

	private static final long serialVersionUID = 1L;

	public void Annoce() {
		System.out.println("This is sub class!");
	}

}
