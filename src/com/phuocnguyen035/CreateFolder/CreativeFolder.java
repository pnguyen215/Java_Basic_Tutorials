package com.phuocnguyen035.CreateFolder;

import java.io.File;

public class CreativeFolder {

	public CreativeFolder() {
	}

	public void createFolder(String string) {
		File directory = new File(string);
		if (!directory.exists()) {
			directory.mkdir();
			System.out.println("Finish!");
		} else {
			System.out.println("Folder is exist!");
		}
	}
}
