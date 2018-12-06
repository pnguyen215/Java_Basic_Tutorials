package com.phuocnguyen028.Enum;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		System.out.println(MyEnum.NAME.getName());
		MyEnum.NAME.setName("David");
		System.out.println(MyEnum.NAME.getName());
		MyEnum.AGE.setName("Nguyen");
		System.out.println(MyEnum.AGE.getName());
		MyEnum.AGE.setAge(21);
		System.out.println(MyEnum.AGE.getAge());
		MyEnum.ADDRESS.setAddress("398 Le Van Luong");
		MyEnum.ADDRESS.setName("NguyenHuuPhuoc");
		MyEnum.ADDRESS.setAge(21);
		System.out.println(MyEnum.ADDRESS.getAddress());
		System.out.println(MyEnum.ADDRESS.toString());

		// Enumerated, Method, Logic
		double result = Operation.PLUS.calculate(2, 5);
		System.out.println(result);
		Operation.POINTTO.printOutEnumObject();
		// To convert a String to Enumerated object
		Operation result2 = Operation.valueOf("times".toUpperCase());
		System.out.println(result2.calculate(10, 10));

	}

}
