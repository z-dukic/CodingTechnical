package medium;

public class Test004BasicArithmeticOperations {

	// Write a function that does the following for the given values: add, subtract,
	// divide and multiply . This is simply referred to as the basic arithmetic
	// operations. The variables have to be defined, but in this challenge, it will
	// be defined for you. All you have to do, is to check the variables, do some
	// string to integer conversion, use some if conditions, and apply the
	// arithmetic operation.

	public static int operation(String a, String b, String op) {

		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);

		switch (op) {
		case "multiply":
			return x * y;
		case "divide":
			if (y == 0) {
				return -2147483648;
			} else {
				return x / y;
			}
		case "add":
			return x + y;
		case "subtract":
			return x - y;
		default:
			return 0;

		}

	}

	public static void main(String[] args) {
		System.out.println(operation("10", "0", "divide"));

	}

}
