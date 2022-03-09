package easy;

public class Test004Calculator {

	public static int calculator(int num1, char operator, int num2) {

		// Create a function that takes two numbers and a mathematical operator + - / *
		// and will perform a calculation with the given numbers.

		if (num2 == 0) {
			return 0;

		} else {
			switch (operator) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return num1 / num2;

			}

		}
		return num2;

	}

}
