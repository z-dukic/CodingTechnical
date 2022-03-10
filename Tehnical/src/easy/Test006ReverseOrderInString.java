package easy;

public class Test006ReverseOrderInString {

	// Create a method that takes a string as its argument and returns the string in
	// reversed order.

	// https://www.geeksforgeeks.org/stringbuffer-class-in-java/
	// Wrapper class for string

	public static String reverse(final String str) {

		String reverse = new StringBuffer(str).reverse().toString();
		return reverse;
		

	}

}
