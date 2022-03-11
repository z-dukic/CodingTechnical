package easy;

public class Test011JoinTwoStrings {

	public static String getWord(String left, String right) {

		// A word has been split into a left part and a right part. Re-form the word by
		// adding both halves together, changing the first character to an uppercase
		// letter.

		String firstName = left.substring(0, 1).toUpperCase() + left.substring(1, left.length());
		System.out.println(firstName);

		String joinedName = firstName + right;

		return joinedName;

	}

	public static void main(String[] args) {

		System.out.println(getWord("booty", "licius"));

	}

}
