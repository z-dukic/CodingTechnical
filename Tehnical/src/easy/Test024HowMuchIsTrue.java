package easy;

public class Test024HowMuchIsTrue {

	/*
	 * Create a function which returns the number of true values there are in an
	 * array.
	 * 
	 * Examples countTrue([true, false, false, true, false]) ➞ 2
	 */

	public class Challenge {
		public static int countTrue(boolean[] arr) {
			int count = 0;
			for (boolean b : arr) {
				if (b == true) {
					count++;
				}
			}
			return count;
		}
	}

}
