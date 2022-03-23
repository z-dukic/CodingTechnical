package medium;

import java.util.Arrays;

public class Test022RecursionArraySum {

	// Write a function that finds the sum of an array. Make your function
	// recursive.
	
	public class Program {
		public static int sum(int[] arr) {
	 if (arr == null || arr.length == 0) {
	            return 0;
	        }
	        if (arr.length == 1) {
	            return arr[0];
	        }


	        return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
		}
	}
}
