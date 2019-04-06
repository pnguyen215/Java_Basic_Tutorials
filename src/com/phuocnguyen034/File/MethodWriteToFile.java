package com.phuocnguyen034.File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class MethodWriteToFile {
	public final String SET_NAME_FILE = "Test_PhuocNguyen.txt";

	/*
	 * write to file unused UTF8
	 */
	public void writeToFileUsingFileOutputStream(String string) throws IOException {

		File file = new File(SET_NAME_FILE);
		if (file.exists()) {
			FileOutputStream fileOutputStream = new FileOutputStream(file, true); /* Permission to override file */
			/* write content to file */
			fileOutputStream.write(string.getBytes());
			fileOutputStream.write("\r\n".getBytes());
			fileOutputStream.close();
		} else {
			System.out.println("Can not write to file!");
		}
	}

	/*
	 * write to file unused UTF8
	 */
	public void writeToFileUsingBufferWriter(String contents) throws IOException {
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;
		fileWriter = new FileWriter(SET_NAME_FILE, true);
		bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(String.valueOf(contents));
		bufferedWriter.close();
		fileWriter.close();
	}

	/*
	 * write to file with UTF8
	 */
	public void writeToFileUsingBufferedWriterUTF_8(String contents) throws IOException {
		/*
		 * open thread to write content from file
		 */
		File file = new File(SET_NAME_FILE);
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "utf8"));
		writer.append(contents).append("\r\n");
		writer.flush();
		writer.close();
	}
}
