package medium;

public class Test010TheEmptySquareSequance {

	// In the image below, squares are either empty or filled with a circle.

	public static int emptySq(int step) {

		int totalSize = step * step * 4;
		int noOfSquares = step * 4;	
		int noOfBlankSpaces = totalSize - noOfSquares;
			
		System.out.println(totalSize);
		System.out.println(noOfSquares);
		System.out.println(noOfBlankSpaces);
		System.out.println();

		return noOfBlankSpaces;

	}

	public static void main(String[] args) {
		
		//System.out.println(emptySq(2)); // 8 2+4 1x8
		System.out.println(emptySq(3)); // 24 2+4+6 3x8
		//System.out.println(emptySq(4)); // 48 2+4+6+8 6x8
		//System.out.println(emptySq(5)); // 120 2+4+6+8+10 15x8
		//System.out.println(emptySq(6)); //
		
	}

}
