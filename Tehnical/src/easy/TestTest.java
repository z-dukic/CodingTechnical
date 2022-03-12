package easy;

public class TestTest {

	public static String swapFirstAndLast(String s) {

		int stringLength = s.length();
		String startOfTheString = s.substring(0, 1);
		String endOfTheString = s.substring(stringLength - 1);

		if (s.length() < 2) {
			return s;
		} else if (startOfTheString.equals(endOfTheString)) {
			return "Two's a pair.";
		} else {
			char[] ch = s.toCharArray();

			char temp = ch[0];
			ch[0] = ch[ch.length - 1];
			ch[ch.length - 1] = temp;

			return String.valueOf(ch);

		}

	}

	public static void main(String args[]) {

		String s = "GeeksForGeeks";

		System.out.println(swapFirstAndLast(s));
	}
}
