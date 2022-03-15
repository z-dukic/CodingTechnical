package medium;

public class Test013StringEndingMarchesSecondString {

	public static boolean checkEnding(String str1, String str2) {
		
		//Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.
		//checkEnding("abc", "bc") -> true
		
		System.out.println("First sentence: " + str1);
		System.out.println("2nd sentence: " + str2);
		System.out.println();
		
		int str1StringLength = str1.length();
		int str2StringLength = str2.length();
		
		System.out.println("length of first string: " + str1StringLength);
		System.out.println("length of 2nd string: " + str2StringLength);
		System.out.println();
		
		String str2Fixed = str1.substring(str1.length()-str2.length(), str1.length());
		
		
		String str1Fixed = str1.substring(0, str1.length()-str2.length());
		
		
		System.out.println("Bitan dio:  " + str2Fixed);
		System.out.println(str1Fixed);
		
		if(str2Fixed.equals(str2)) {
			return true;
		}else {
			return false;
		}
	
	}

	public static void main(String[] args) {
		
		System.out.println(checkEnding("Manchester United", "ited"));

	}

}
