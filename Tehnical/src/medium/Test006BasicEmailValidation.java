package medium;

public class Test006BasicEmailValidation {
	/*
	 * Create a function that accepts a string, checks if it's a valid email address
	 * and returns either true or false, depending on the evaluation.
	 * 
	 * The string must contain an @ character. The string must contain a .
	 * character. The @ must have at least one character in front of it. e.g.
	 * "e@edabit.com" is valid while "@edabit.com" is invalid. The . and the @ must
	 * be in the appropriate places. e.g. "hello.email@com" is invalid while
	 * "john.smith@email.com" is valid.
	 * 
	 */

	public static boolean validateEmail(String s) {

		if (s.length() < 4) {
			return false;
		}
		if (s.indexOf('@') < 3) {
			return false;
		}
		if (s.indexOf('.') == -1) {
			return false;
		}
		if (s.lastIndexOf('.') < s.indexOf('@')) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(validateEmail("permail.com")); //false
		System.out.println(validateEmail("pero@gmail.com")); //true

	}

}
