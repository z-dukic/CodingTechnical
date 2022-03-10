package veryEasy;

public class Test025DivideEvenly {

	// Given two integers, a and b, return true if a can be divided evenly by b.
	// Return false otherwise. 

	public static boolean dividesEvenly(int a, int b) {

		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
}
