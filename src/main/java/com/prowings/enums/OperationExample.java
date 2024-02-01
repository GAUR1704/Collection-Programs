package com.prowings.enums;

public class OperationExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 0;

		for (Operation operation : Operation.values()) {

			System.out.println(num1 + " " + operation + " " + num2 + " = " + operation.apply(num1, num2));

		}

	}

}

enum Operation {

	ADD {
		int apply(int a, int b) {
			return a + b;
		}
	},

	SUBTRACT {
		int apply(int a, int b) {
			return a - b;

		}
	},

	MULTPLY {
		int apply(int a, int b) {
			return a * b;

		}
	},

	DIVIDE {
		int apply(int a, int b) {
			if (b != 0) {
				return a / b;
			} else
				throw new ArithmeticException("Can not divide by zero.");
		}
	};
	
	abstract int apply(int a , int b);
}
