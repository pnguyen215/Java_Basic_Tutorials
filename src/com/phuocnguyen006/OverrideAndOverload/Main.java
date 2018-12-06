package com.phuocnguyen006.OverrideAndOverload;

public class Main {

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		System.out.println(calculation.Sum(5.7, 3.6));
		System.out.println(calculation.Sum(3, 6));
		System.out.println(calculation.Sum(3l, 8l));

		CalculationExtends calculationExtends = new CalculationExtends();
		System.out.println(calculationExtends.Sum(10.4, 19.5));
		System.out.println(calculationExtends.Sum(12, 12));
		System.out.println(calculationExtends.Sum(12l, 18l));

	}

}
