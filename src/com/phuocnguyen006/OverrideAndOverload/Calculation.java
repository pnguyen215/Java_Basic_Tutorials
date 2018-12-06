package com.phuocnguyen006.OverrideAndOverload;

import java.io.Serializable;

public class Calculation implements Serializable {

	private static final long serialVersionUID = 1L;

	public int Sum(int a, int b) {
		return a + b;
	}

	public long Sum(long a, long b) {
		return a + b;
	}

	public double Sum(double a, double b) {
		return a + b;
	}

	// Now, we call all "Sum" function is Overload, cause each function with
	// argument difference
}
