package easy;

public class Test008CaptureTheRook {

	// Write a function that returns true if two rooks can attack each other, and
	// false otherwise.

	public static boolean canCapture(String[] rooks) {

		if (rooks[0].substring(0, 1).equals(rooks[1].substring(0, 1))
				|| rooks[0].substring(1, 2).equals(rooks[1].substring(1, 2))) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		String[] rooks = { "a1", "b2" };
		rooks.toString();
		canCapture(rooks);
		System.out.println(canCapture(rooks));
	}

}
