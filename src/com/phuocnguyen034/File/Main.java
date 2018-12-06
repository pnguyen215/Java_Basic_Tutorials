package com.phuocnguyen034.File;

import java.io.IOException;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		ReadFile rfile = new ReadFile();
		WriteFile wfile = new WriteFile();
		try {
			rfile.readFile();
			wfile.writeFile("Nguyen Huu Phuoc");
			wfile.writeFile("\n");
			wfile.writeFile("Age: 21");
			rfile.readFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
