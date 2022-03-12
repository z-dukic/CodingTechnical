package medium;

public class Test007MagicDate {
	/*
	 * // You are to read each part of the date into its own integer type variable.
	 * The // year should be a 4 digit number. You can assume the user enters a
	 * correct // date formatted d m yyyy (no error checking required). Determine
	 * whether the entered date is a magic date. Here are the rules for a magic
	 * date:
	 * 
	 * mm * dd is a 1-digit number that matches the last digit of yyyy or mm * dd is
	 * a 2-digit number that matches the last 2 digits of yyyy or mm * dd is a
	 * 3-digit number that matches the last 3 digits of yyyy
	 * 
	 * The program should then display true if the date is magic, or false if it is
	 * not.
	 * 
	 * Examples Magic("1 1 2011") - true
	 */

	public static boolean magic(String str) {

		String date = str.substring(0, 1);
		String month = str.substring(2, 3);
		String year = str.substring(4, 8);

		System.out.println(date);
		System.out.println(month);
		System.out.println(year);

		int dateFixed = Integer.valueOf(date);
		int monthFixed = Integer.valueOf(month);
		int yearFixed = Integer.valueOf(year);

		int magicDate = dateFixed * monthFixed;

		if (magicDate == yearFixed - 2000 || magicDate == yearFixed - 2010) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(magic("1 5 2011"));

	}

}
