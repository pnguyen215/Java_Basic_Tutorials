package com.phuocnguyen034.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodReadFromFile {
	public final String SET_NAME_FILE = "Test_PhuocNguyen.txt";

	public MethodReadFromFile() {
	}

	/*
	 * read into file unused UTF8
	 */
	public void readFileUsingFileInputStream() throws IOException {
		File file = new File(SET_NAME_FILE);
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

	/*
	 * read content into file use UTF-8
	 */
	public void readFileUsingBufferedWithUTF_8() throws IOException {
		String contents = "";
		File file = new File(SET_NAME_FILE);
		if (!file.exists()) {
			file.createNewFile();

		} else {
			FileInputStream fileInputStream = new FileInputStream(file);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			while ((contents = bufferedReader.readLine()) != null) {
				System.out.println(contents);
			}
			bufferedReader.close();
		}
	}

}
