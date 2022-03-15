package easy;

public class Test020BoxVolume {

	// Create a function that takes an object argument sizes (contains width,
	// length, height keys) and returns the volume of the box.
	//volumeOfBox({ width: 2, length: 5, height: 1 }) ➞ 10

	//volumeOfBox({ width: 4, length: 2, height: 2 }) ➞ 16

	//volumeOfBox({ width: 1, length: 2, height: 3 }) ➞ 6
	

		
	public static int volumeOfBox(int[] sizes) {
		
		int boxSize = sizes[0] * sizes[1] * sizes[2];
		
		return boxSize;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
