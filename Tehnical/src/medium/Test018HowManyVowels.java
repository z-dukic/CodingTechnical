package medium;

public class Test018HowManyVowels {

	// Create a function that takes a string and returns the number (count) of
	// vowels contained within it.

	/*
	 * ountVowels("Celebration") ➞ 5
	 * 
	 * countVowels("Palm") ➞ 1
	 * 
	 * countVowels("Prediction") ➞ 4
	 * 
	 */

	public static int getCount(String str) {
		int vowelsCount = 0;
		// Your code here

		char[] letters = new char[str.length()];

		for (int i = 0; i <= str.length() - 1; i++) {
			letters[i] = str.charAt(i);

			if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') {
				vowelsCount += 1;
			}

			System.out.println(letters[i]);

		}

		return vowelsCount;
	}

	public static void main(String[] args) {
		System.out.println(getCount("pero"));

	}

}

/* better solution
 public class Vowels {
  public static int getCount(String str) {
    return str.replaceAll("[^aeiouAEIOU]", "").length();
  }
}
*/
