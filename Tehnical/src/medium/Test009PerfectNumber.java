package medium;

public class Test009PerfectNumber {

	/*
	 * Create a function that tests whether or not an integer is a perfect number. A
	 * perfect number is a number that can be written as the sum of its factors,
	 * (equal to sum of its proper divisors) excluding the number itself.
	 * 
	 * For example, 6 is a perfect number, since 1 + 2 + 3 = 6, where 1, 2, and 3
	 * are all factors of 6. Similarly, 28 is a perfect number, since 1 + 2 + 4 + 7
	 * + 14 = 28.
	 * 
	 * checkPerfect(6) -> true
	 * checkPerfect(496) -> true
	 * checkPerfect(12) -> false
	 */



	public static boolean checkPerfect(int num) {

		//Initialize 
		int i, sum = 0;

		//when you divide a number and there is no "leftovers" add to sum
		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.println(sum);
				sum = sum + i;
			}
		}

		if (sum == num) {
			System.out.println(num + " is perfect");
			return true;
		} else {
			System.out.println(num + " is not perfect");
			return false;
		}
	}

	public static void main(String args[]) {
		System.out.println(checkPerfect(496));
	}

}
