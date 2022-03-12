package easy;

public class Test017TriangularNumberSequence {
	// This Triangular Number Sequence is generated from a pattern of dots that form
	// a triangle. The first 5 numbers of the sequence, or dots, are:

	// 1, 3, 6, 10, 15
	// This means that the first triangle has just one dot, the second one has three
	// dots, the third one has 6 dots and so on.

	// Write a function that returns the number of dots when given its corresponding
	// triangle number of the sequence.
	
	public static int triangle(int n) {
		
		int sum = 0;
		
		for(int i=1; i <= n; i++) {
			sum +=i; 
			
		}
		
		return sum;
	  }
	

	public static void main(String[] args) {
		System.out.println(triangle(5));
		

	}

}
