package medium;

import java.util.Arrays;

public class Test017ArrayOfMultiples {

	/*
	 * Create a function that takes two numbers as arguments (num, length) and
	 * returns an array of multiples of num until the array length reaches length.
	 * 
	 * arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
	 * 
	 * arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
	 * 
	 * arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
	 */

	public static int[] arrayOfMultiples(int num, int length) {

		//initialization, must have for array.length
		int[] array = new int[length];
		
		//debug
		System.out.println("Number you have to multiply: " + num);
		System.out.println("number of times you have to multiplay: " + length);

		
		for (int i = 0; i <= array.length-1; i++) {
			//for (int i = 0; i <length; i++) {
			//num * i @ array[0]
			array[i] = num + (i * num);
			System.out.println(array[i]);

		}
			
		return array;

	}

	public static void main(String[] args) {

		System.out.println(arrayOfMultiples(7, 5));

	}

}
