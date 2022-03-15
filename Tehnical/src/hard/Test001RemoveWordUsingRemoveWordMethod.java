package hard;

public class Test001RemoveWordUsingRemoveWordMethod {

	/*
	 * Implement a method removeWord() that takes two string parameters:
	 * 
	 * sentence - the sentence you are to remove a word from. word - the word you
	 * are to remove from the sentence. Your method should take a string, sentence
	 * and remove word from it. It will return a new string without word in the
	 * sentence.
	 * 
	 * Examples removeWord("One two three four", "two") ➞ "One three four"
	 * 
	 * removeWord("Bob has a kid", "kid") ➞ "Bob has a"
	 */

	// 565

	//Logic solution
	public static String removeWord(final String sentence, final String word) {

		// Every word is an array
		String msg[] = sentence.split(" ");
		String newSentence = "";

		// iterate string using words
		for (String words : msg) {
			if (!words.equals(word)) {
				newSentence = newSentence + words + " ";
			}
		}
		String lastWord = msg[msg.length - 1];

		if (lastWord.equals(word)) {
			return new String(newSentence);
		} else if (newSentence.substring(newSentence.length() - 1, newSentence.length()).equals(" ")) {
			String removedSentance = newSentence.substring(0, newSentence.length() - 1);
			return new String(removedSentance);
		} else {
			return new String(newSentence);

		}

	}

	//Simpler solution
	public static String removeWord1(final String sentence, final String word) {
		return new String(sentence.replace(word, "")).replaceAll("\\s+", " ");
	}

	public static void main(String[] args) {
		System.out.println(removeWord("The quick brown jumped over the lazy dog", "fox"));
		System.out.println(removeWord1("The quick brown jumped over the lazy dog", "fox"));

	}

}
