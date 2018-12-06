package com.phuocnguyen034.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public ReadFile() {
	}

	public void readFile() throws IOException {
		File file = new File("Test.txt");
		if (!file.exists()) {
			file.createNewFile();

		} else {
			FileInputStream fileInputStream = new FileInputStream(file);
			int words = fileInputStream.read();
			while (words != -1) {
				System.out.print((char) words);
				words = fileInputStream.read();
			}
			fileInputStream.close();
		}
		System.out.println("Finish!");
	}
}
