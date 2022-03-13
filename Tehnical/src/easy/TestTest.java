package easy;

public class TestTest {

	public static boolean getXO(String str) {

		int xCount = 0;
		int oCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
				xCount++;
			} else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
				oCount++;
			}
		}
		return xCount == oCount;

	}

}
