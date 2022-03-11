package easy;

public class Test012ExistsANumberHigher {

	// Write a function that returns true if there exists at least one number that
	// is larger than or equal to n.
	
	public static boolean existsHigher(int[] arr, int n) {
		
		for(int i=0; i<=arr.length-1;i++) {
			System.out.println( arr[i]);
			if(arr[i] >= n) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		int[] testArray = {2,3,5,6,7};
		int checkArray = 6;
		System.out.println(existsHigher(testArray, checkArray));

	}

}
