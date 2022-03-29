package medium;

public class Test026QuadraticEquation {

	/*
	 * Create a function to find only the root value of x in any quadratic equation
	 * ax^2 + bx + c. The function will take three arguments:
	 * 
	 * a as the coefficient of x^2 b as the coefficient of x c as the constant term
	 */

	public static int quadraticEquation(int a, int b, int c) {
		return (int) (((-b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
	}

}
