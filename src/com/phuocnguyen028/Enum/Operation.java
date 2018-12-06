package com.phuocnguyen028.Enum;

public enum Operation {
	PLUS, MINUS, TIMES, DIVIDE, POINTTO;
	public double calculate(double a, double b) {
		switch (this) {
		case PLUS:
			return a + b;
		case MINUS:
			return a - b;
		case TIMES:
			return a * b;
		case DIVIDE:
			return a / b;
		default:
			throw new AssertionError("Unknown operations " + this);
		}
	}

	// To loop an enumerated object
	public void printOutEnumObject() {
		for (Operation operation : Operation.values()) {
			System.out.println(operation);
		}
	}
}
