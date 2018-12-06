package com.phuocnguyen001.SortAndSearch;

import java.util.Scanner;

public class SortAndSearch {

	public Scanner isEnter() {
		Scanner scanner = new Scanner(System.in);
		return scanner;

	}

	public void isShow(int key) {
		System.out.println(key);
	}

	public void isEnterArray(int number) {

		System.out.println("Enter each elements: ");
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = isEnter().nextInt();
		}

		System.out.println();
		printfArray(array);
		System.out.println();
		isShow(isKey(array, 4));

		isSort(array);
		System.out.println();
		printfArray(array);
	}

	public void printfArray(int[] array) {
		for (int x : array) {
			System.out.println(x);
		}
	}

	public void isSort(int[] array) {
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			temp = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (temp > array[j]) {
					array[i] = array[j];
					array[j] = temp;
					temp = array[i];

				}
			}
		}
	}

	public int isKey(int[] array, int key) {
		int res = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (key == array[i]) {
				res = i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		SortAndSearch sortAndSearch = new SortAndSearch();
		sortAndSearch.isEnterArray(7);

	}

}
