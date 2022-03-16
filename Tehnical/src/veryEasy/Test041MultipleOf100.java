package veryEasy;

public class Test041MultipleOf100 {

	// Create a function that takes an integer and returns true if it's divisible by
	// 100, otherwise return false.

	public static boolean divisible(int num) {
		
		if(num % 100 == 0) {
			return true;
		}else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(divisible(101));
	}

}
