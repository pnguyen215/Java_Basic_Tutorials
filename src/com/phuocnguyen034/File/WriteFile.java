package com.phuocnguyen034.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public WriteFile() {
	}

	public void writeFile(String string) throws IOException {

		File file = new File("Test.txt");
		if (file.exists()) {
			FileOutputStream fileOutputStream = new FileOutputStream(file, true); /* Permission to override file */
			fileOutputStream.write(string.getBytes()); /* write content to file */
			fileOutputStream.close();
		} else {
			System.out.println("Can not write to file!");
		}
	}
}
