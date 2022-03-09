package easy;

public class Test005DoubleLetters {

	// Create a function that takes a word and returns true if the word has two
	// consecutive identical letters.
	
	public static boolean doubleLetters(String word) {
		for (int i=0;i<word.length()-1;i++)
			if (word.charAt(i)==word.charAt(i+1))
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(doubleLetters("Peeero"));
	}

}
