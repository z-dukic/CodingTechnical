package medium;

import java.lang.Math;

public class Test023 {

	/*
	 * 
	 * Given the shortest side of a 30° by 60° by 90° triangle, find out the other
	 * two sides. Return the longest side and medium-length side in that order.
	 * 
	 * Examples otherSides(1) ➞ [2.0, 1.73]
	 */

	public class SideLengths {
		public static double[] otherSides(int n) {
			double[] output = new double[2];
			output[0] = (double) (2 * n);
			output[1] = (double) (n * Math.sqrt(3));
			return output;
		}
	}
}
