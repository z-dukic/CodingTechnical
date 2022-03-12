package easy;

public class Testetstet {
	
	public static String flipEndChars(String s) {

		int stringLength = s.length();
		System.out.println("1. String lenght: " + stringLength);

		String startOfTheString = s.substring(0, 1);
		String endOfTheString = s.substring(stringLength - 1);

		System.out.println("2. Start: " + startOfTheString);
		System.out.println("3. End: " + endOfTheString);
		
		if (s.length() < 2) {
			return "4. Incompatible.";
		} else if (startOfTheString.equals(endOfTheString)) {
			return "5. Two's a pair.";
		} else {
			String middleOfTheString = s.substring(1, stringLength - 1);
			System.out.println("6. middle: " + middleOfTheString);
			return endOfTheString + middleOfTheString + startOfTheString;
		}

	}

	public static void main(String[] args) {

		System.out.println(flipEndChars("dfdkf49824fdfdfjhd"));

	}

}
