package easy;

public class TestTest {

	public static boolean checkPerfect(int num) {

		int i, sum = 0;

		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == num) {
			System.out.println(num + " is perfect");
			return true;
		} else {
			System.out.println(num + " is not perfect");
			return false;
		}
	}

	public static void main(String args[]) {
		System.out.println(checkPerfect(496));
	}
}
