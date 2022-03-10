package veryEasy;

public class Test024CheckForSpace {

	// Create a function that returns true if a string contains any spaces.
	public static boolean hasSpaces(String str) {

		char emptyString = ' ';

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == emptyString) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(hasSpaces("P ero"));

	}

}
