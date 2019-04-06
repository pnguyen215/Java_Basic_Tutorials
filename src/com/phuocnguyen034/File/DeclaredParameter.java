package com.phuocnguyen034.File;

import java.io.Serializable;

public class DeclaredParameter implements Serializable {

	private static final long serialVersionUID = 1L;

	public final String SET_NAME_FILE = "Test_PhuocNguyen.txt";
	public final String SET_NAME_FILE_DESTINATION = "PhuocNguyen.dat";

	public String destinationFileFirst() {
		return SET_NAME_FILE;
	}

	public String destinationFileSecond() {
		return SET_NAME_FILE_DESTINATION;
	}
}
