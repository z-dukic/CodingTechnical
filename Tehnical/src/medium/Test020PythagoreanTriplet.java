package medium;

public class Test020PythagoreanTriplet {

	public static boolean isTriplet(int a, int b, int c) {

		// Create a function that validates whether the three given integers form a
		// Pythagorean triplet which is defined as the sum of the squares of the two
		// smallest integers must be equal to the square of the largest integer.
		//isTriplet(3, 4, 5) -> true
		// 3² + 4² = 25
		// 5² = 25
		
		
		int aFixed = a * a;
		int bFixed = b * b;
		int cFixed = c * c;
		int sum = 0;
		int check = 0;
		
		System.out.println(aFixed);
		System.out.println(bFixed);
		System.out.println(cFixed);
		
		if((aFixed < bFixed) && (cFixed < bFixed)) {
			
			if(bFixed == (aFixed + cFixed)) {
				return true;
			}
			
		}else if((aFixed < cFixed) && (bFixed < cFixed)) {
			
			if(cFixed == (aFixed + bFixed)) {
				return true;
			}
			
		} else if((cFixed < aFixed) && (bFixed < aFixed)) {
			
			if(aFixed == (cFixed + bFixed)) {
				return true;
			}
		}else {
			return false;
		}
		
		return false;

		
		
	}

	public static void main(String[] args) {
		System.out.println(isTriplet(12, 20, 18));

	}

}
