package com.phuocnguyen006.OverrideAndOverload;

import java.io.Serializable;

public class CalculationExtends extends Calculation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public double Sum(double a, double b) {
		return a + b + 100;
	}

	@Override
	public int Sum(int a, int b) {
		return a + b + 10;

	}

	@Override
	public long Sum(long a, long b) {
		return a + b + 5;
	}

	// Now, we call all "Sum" function is Override, we will change type return value
	// or operation
}
