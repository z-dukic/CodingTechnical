package easy;

public class Test019StutteringFunction {

	// Write a function that stutters a word as if someone is struggling to read it.
	// The first two letters are repeated twice with an ellipsis ... and space after
	// each, and then the word is pronounced with a question mark ?.
	
	
	public static String stutter(String word) {
		
		String stutter = word.substring(0, 2);
		
		
		return stutter + "... " + stutter + "... " + word + "?";
		
	}

	public static void main(String[] args) {
		System.out.println(stutter("perica"));
		

	}

}
