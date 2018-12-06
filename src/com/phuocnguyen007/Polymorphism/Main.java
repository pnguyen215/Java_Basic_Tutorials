package com.phuocnguyen007.Polymorphism;

public class Main {

	public static void main(String[] args) {

		NoticeExtends noticeExtends = new NoticeExtends("Phuoc");
		noticeExtends.Annoce();

		Notice notice = new NoticeExtends("PhuocNguyen"); // point to object on heap
		notice.Annoce();

		Notice notices = new Notice("David");
		notices.Annoce();
		// what is polymorphism?
		// We using declare variable data type is master class and point to object on heap is sub class
	}

}
