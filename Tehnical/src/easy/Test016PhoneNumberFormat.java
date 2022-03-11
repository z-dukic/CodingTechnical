package easy;

import java.util.Arrays;

public class Test016PhoneNumberFormat {

	// Create a method that takes an array of 10 integers (between 0 and 9) and
	// returns a string of those numbers formatted as a phone number (e.g. (555)
	// 555-5555).

	public static String formatPhoneNumber(int[] nums) {

		return "(" + nums[0] + nums[1] + nums[2] + ") " + nums[3] + nums[4] + nums[5] + "-" + nums[6] + nums[7]
				+ nums[8] + nums[9];

	}
	
	//Better solution
	public class Program {
	    public static String formatPhoneNumber(int[] nums) {
	      return String.format("(%d%d%d) %d%d%d-%d%d%d%d", nums[0], nums[1], nums[2], nums[3],
														nums[4], nums[5], nums[6], nums[7], nums[8], nums[9]);
	    }
	}
	
	//Also better solution
	public static String formatPhoneNumber2(int[] nums) {
		String result = "";
		for (int i = 0; i < nums.length; i++){
			if (i == 0){
				result+= "(";
			}	
			if (i == 3){
				result += ") ";
			}
			if (i == 6){
				result += "-";
			}
			result += nums[i];
		}
		
		return result;
	}

	public static void main(String[] args) {

		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(formatPhoneNumber(numbers));
	}

}
