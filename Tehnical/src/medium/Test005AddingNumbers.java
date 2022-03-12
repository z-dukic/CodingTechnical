package medium;

public class Test005AddingNumbers {

	// Create a function that takes two number strings and returns their sum as a
	// string.

	// Example: add("111", "111") ➞ "222"

	public static String add(String a, String b) {

		int x, y = 0;

		if ((a == "" || a == null) || (b == "" || b == null)) {
			System.out.println("Invalid Operation");
			return "Invalid Operation";
		} else {

			x = Integer.valueOf(a);
			y = Integer.valueOf(b);

		}

		int sum = 0;

		if (x / 1 == x && y / 1 == y) {
			sum = x + y;
		} else {
			System.out.println("Invalid Operation");
		}

		String result = String.valueOf(sum);
		System.out.println(sum);

		return result;

	}

	public static void main(String[] args) {

		add("5", null);

	}

}
