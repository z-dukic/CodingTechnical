package medium;

public class Test024CountTheDigits {

	// Create a function that will count the number of digits of a number.
	// Conversion of the number to a string is not allowed, thus, the approach is
	// either recursive or iterative.

	public class LongDigits {
		public static int digitsCount(long n) {
			int digits = 0;
			if (n == 0)
				return 1;
			else {
				while (n != 0) {

					n = n / 10;
					digits++;
				}
			}
			return digits;
		}
	}

}
