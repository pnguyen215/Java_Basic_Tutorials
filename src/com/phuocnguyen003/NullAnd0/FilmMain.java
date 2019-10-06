package com.phuocnguyen003.NullAnd0;

public class FilmMain {

	public static void main(String[] args) {

		Film film = null; // no point to object anywhere in Heap Memory

		// Create new film object

		film = new Film("Ultron", 2017);
		System.out.println(film.toString());

	}

}
