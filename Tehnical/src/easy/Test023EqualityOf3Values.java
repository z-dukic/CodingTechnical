package easy;

public class Test023EqualityOf3Values {

	// Create a function that takes three integer arguments (a, b, c) and returns
	// the amount of integers which are of equal value.
	
	public class Challenge {
		  public static int equal(int a, int b, int c) {
		    
		    if (a == b && b == c) {
		      return 3;
		    }
		    if (a ==b || a == c || b == c){
		      return 2;
		    }
		    return 0;
		  }
		}

}
