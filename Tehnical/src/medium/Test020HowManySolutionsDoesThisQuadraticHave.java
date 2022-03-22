package medium;

public class Test020HowManySolutionsDoesThisQuadraticHave {

	// A quadratic equation a x² + b x + c = 0 has either 0, 1, or 2 distinct
	// solutions for real values of x. Given a, b and c, you should return the
	// number of solutions to the equation.

	public static int solutions(int a, int b, int c) {
		if (b == 0) {
			return 1;
		} else if (b < 0) {
			return 0;
		} else
			return 2;
	}

}
