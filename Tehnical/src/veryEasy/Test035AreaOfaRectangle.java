package veryEasy;

public class Test035AreaOfaRectangle {

	// Create a function that calculates the area of a rectangle. If the arguments
	// are invalid, your function must return -1.

	public static int getArea(int h, int w) {

		if (h <= 0 || w <= 0) {
			return -1;
		} else {
			return h * w;
		}

	}

}
