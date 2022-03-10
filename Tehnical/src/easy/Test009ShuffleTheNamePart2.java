package easy;

import java.util.Arrays;

public class Test009ShuffleTheNamePart2 {

	public static String nameShuffle(String s) {
		
		//Switch first letter in lastname with first letter in name
		//Donald Trump => Tonald Drump

		// Split Donald and Trump
		String[] nameSurname = s.split(" ");
		System.out.println(Arrays.toString(nameSurname));

		// Array[0] is Donald
		String firstName = nameSurname[0];
		System.out.println("First name from array to string: " + firstName);

		// Remove first letter from Donald
		String firstNameFixed = firstName.substring(1, firstName.length());
		System.out.println("Removed first letter from name: " + firstNameFixed);

		// First letter in Donald name is:
		String firstLetterInName = firstName.substring(0, 1);
		System.out.println("First letter in name: " + firstLetterInName);

		// Array[1] is Trump
		String lastName = nameSurname[1];
		System.out.println("Last name from array to string: " + lastName);

		// Last name without first letter
		String lastNameFixed = lastName.substring(1, lastName.length());
		System.out.println("Last name without first letter: " + lastNameFixed);

		String firstLetterInLastName = lastName.substring(0, 1);
		System.out.println("First letter in last name: " + firstLetterInLastName);

		return firstLetterInLastName + firstNameFixed + " " + firstLetterInName + lastNameFixed;
	}

	// Tonald Drump

	public static void main(String[] args) {

		System.out.println(nameShuffle("donald trump"));

	}

}
