package easy;

import java.util.Arrays;

public class Test025SortNumbersInAscendingOrder {
	/*
	 * Create a method that takes an array of integers and returns a new array,
	 * sorted in ascending order (smallest to biggest).
	 * 
	 * Sort integer array in ascending order. If the function's argument is null, an
	 * empty array, or undefined; return an empty array. Return a new array of
	 * sorted numbers.
	 */
	
	 public static int[] sortNumsAscending(int[] nums) {
	      int[] result = {};
	      if (nums == null || nums.length == 0)
	        return result;
	      else
	      {
	        Arrays.sort(nums);
	        return nums;
	      }
	    }

}
