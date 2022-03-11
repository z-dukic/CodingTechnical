package easy;

public class Test015The3Programmers {

	// You hired three programmers and you (hopefully) pay them. Create a function
	// that takes three numbers (the hourly wages of each programmer) and returns
	// the difference between the highest-paid programmer and the lowest-paid.

	public static int programmers(int one, int two, int three) {

		// 147, 33, 526

		if (one >= two && one > three) {
			if (two > three) {
				return one - three;
			} else {
				return one - two;
			}
		} else if (two > one && two >= three) {
			if (one > three) {
				return two - three;
			} else {
				return two - one;
			}

		} else if (three >= one && three > two) {
			if (one > two) {
				return three - two;
			} else {
				return three - one;
			}

		} else {
			return 5656;
		}

	}

	public static void main(String[] args) {
		System.out.println(programmers(43, 33, 43));
		
	}

}
