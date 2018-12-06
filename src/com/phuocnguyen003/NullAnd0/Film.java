package com.phuocnguyen003.NullAnd0;

import java.io.Serializable;

public class Film implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private int release;

	public Film() {
		super();
	}

	public Film(String name, int release) {
		super();
		this.name = name;
		this.release = release;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRelease() {
		return release;
	}

	public void setRelease(int release) {
		this.release = release;
	}

	@Override
	public String toString() {
		return "Film's name: " + getName() + ", " + "Release: " + getRelease();
	}

}
