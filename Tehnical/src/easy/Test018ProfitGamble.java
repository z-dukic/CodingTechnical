package easy;

public class Test018ProfitGamble {

	// Create a function that takes three arguments prob, prize, pay and returns
	// true if prob * prize > pay; otherwise return false.

	// To illustrate:

	// profitableGamble(0.2, 50, 9)
	// ... should yield true, since the net profit is 1 (0.2 * 50 - 9), and 1 > 0.
	
	public static boolean profitableGamble(double prob, double prize, double pay) {
		
		double result = prob * prize - pay;
		
		if(result > 0) {
			return true;
		}else {
			return false;
		}
		
		
		
		
	}

	public static void main(String[] args) {
		System.out.println(profitableGamble(0.2, 50, 9));

	}

}
