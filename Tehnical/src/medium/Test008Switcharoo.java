package medium;

public class Test008Switcharoo {

	/*
	 * Create a function that takes a string and returns a new string with its first
	 * and last characters swapped, except under two conditions:
	 * 
	 * If the length of the string is less than two, return "Incompatible.". If the
	 * first and last characters are the same, return "Two's a pair.".
	 * 
	 * flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"
	 * 
	 * flipEndChars("ada") ➞ "Two's a pair."
	 * 
	 * flipEndChars("Ada") ➞ "adA"
	 * 
	 * flipEndChars("z") ➞ "Incompatible."
	 */

	//1st solution
	public static String flipEndChars(String s) {

		int stringLength = s.length();
		System.out.println("1. String lenght: " + stringLength);

		String startOfTheString = s.substring(0, 1);
		String endOfTheString = s.substring(stringLength - 1);

		System.out.println("2. Start: " + startOfTheString);
		System.out.println("3. End: " + endOfTheString);

		if (s.length() < 2) {
			return "4. Incompatible.";
		} else if (startOfTheString.equals(endOfTheString)) {
			return "5. Two's a pair.";
		} else {
			String middleOfTheString = s.substring(1, stringLength - 1);
			System.out.println("6. middle: " + middleOfTheString);
			return endOfTheString + middleOfTheString + startOfTheString;
		}

	}

	// 2nd solution

	public static String swapFirstAndLast1(String str) {

		int stringLength = str.length();
		String startOfTheString = str.substring(0, 1);
		String endOfTheString = str.substring(stringLength - 1);

		if (str.length() < 2) {
			return str;
		} else if (startOfTheString.equals(endOfTheString)) {
			return "Two's a pair.";
		} else {
			char[] ch = str.toCharArray();

			char temp = ch[0];
			ch[0] = ch[ch.length - 1];
			ch[ch.length - 1] = temp;

			return String.valueOf(ch);
		}
	}

	public static void main(String[] args) {

		System.out.println(flipEndChars("xzzzzx"));
		System.out.println(swapFirstAndLast1("xzzzzx"));

	}

}
