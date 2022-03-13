package medium;

public class Test010DifferenceOfMaxAndMinNumbersInArray {

	// Create a function that takes an array and returns the difference between the
	// biggest and smallest numbers.
	// differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
	// Smallest number is -50, biggest is 32.

	public static int differenceMaxMin(int[] arr) {

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}

		return max - min;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 4, 1, 2, 8, 91 };
		System.out.println(differenceMaxMin(arr));

	}

}
