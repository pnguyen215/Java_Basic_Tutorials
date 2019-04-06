package com.phuocnguyen034.File;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		MethodReadFromFile methodReadFromFile = new MethodReadFromFile();
		MethodWriteToFile methodWriteToFile = new MethodWriteToFile();
		try {
			methodReadFromFile.readFileUsingBufferedWithUTF_8();
			methodWriteToFile.writeToFileUsingBufferedWriterUTF_8("nguyễn hữu phước");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
