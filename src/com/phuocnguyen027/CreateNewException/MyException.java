package com.phuocnguyen027.CreateNewException;

import java.io.Serializable;

public class MyException extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;

	public MyException() {
	}

	private String messages;

	public MyException(String messages) {
		super();
		this.messages = messages;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

}
