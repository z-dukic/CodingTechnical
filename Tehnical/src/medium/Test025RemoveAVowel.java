package medium;

public class Test025RemoveAVowel {

	// Create a function that takes a string and returns a new string with all
	// vowels removed.

	public class Program {
		public static String removeVowels(String s) {
			String vowels = "aAeEiIuUoO";
			String output = "";
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (vowels.indexOf(c) < 0)
					output = output + c;
			}
			return output;
		}
	}

}
