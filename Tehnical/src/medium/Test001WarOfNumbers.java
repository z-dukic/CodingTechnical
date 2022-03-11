package medium;

public class Test001WarOfNumbers {

	public static int warOfNumbers(int[] numbers) {

		// There's a great war between the even and odd numbers. Many numbers already
		// lost their lives in this war and it's your task to end this. You have to
		// determine which group sums larger: the evens, or the odds. The larger group
		// wins.

		// Create a function that takes an array of integers, sums the even and odd
		// numbers separately, then returns the difference between the sum of the even
		// and odd numbers.

		int evenSum = 0;
		int oddSum = 0;
		int sum = 0;
		int sum2 = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evenSum = evenSum + numbers[i];
			} else if (numbers[i] % 2 != 0) {
				oddSum = oddSum + numbers[i];
			} else {
				System.out.println("Something is wrong.");
			}

		}
		sum = oddSum - evenSum;
		System.out.println("OddSum: " + oddSum);
		System.out.println("EvenSum: " + evenSum);
		System.out.println("sum1: " + sum);

		if (sum < 0) {
			sum2 = sum * (-1);
		} else {
			sum2 = sum;
		}

		return sum2;

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 9, 20 };

		System.out.println("Sum2: " + warOfNumbers(array));

	}

}
