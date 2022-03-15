package medium;

import java.util.Arrays;

public class Test016FindTheMissingNumber {

	// Create a method that takes an array of integers between 1 and 10 (excluding
	// one number) and returns the missing number.

	/*
	 * missingNum([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
	 * 
	 * missingNum([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10
	 * 
	 * missingNum([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7
	 */

	public static int missingNum(int[] nums) {
		
		//Create array so you can sort it
		int[] array = nums;
		
		//Sort the array
		Arrays.sort(array);
		
		//Find the last and the biggest number in array
		int biggestNumber = array[array.length - 1];
		System.out.println("biggest number " + biggestNumber);
		
		//Counter so you can match number in array with i
		int counter = 0;

		for (int i = 0; i <= array.length - 1; i++) {
			//add 1 every loop
			counter++;
			//if they are not the same return that number
			if (!(array[i] == counter)) {
				System.out.println(counter);

				return counter;
			}

		}
		
		//if they are all in order, the next number is the missing number
		return counter + 1;

	}

	public static void main(String[] args) {

		int[] testArray = { 7, 2, 3, 6, 5, 9, 1, 4, 8 };
		System.out.println(missingNum(testArray));

	}

}
