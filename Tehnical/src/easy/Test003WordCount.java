package easy;

public class Test003WordCount {

	public static int countWords(String s) {
		// Create a method that takes a string and returns the word count. The string
		// will be a sentence.
		String[] wordArray = s.trim().split("\\s+");
		int wordCount = wordArray.length;
		return wordCount;

	}

}
