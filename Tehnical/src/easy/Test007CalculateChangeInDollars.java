package easy;

public class Test007CalculateChangeInDollars {

	public static boolean changeEnough(int[] change, double amountDue) {

		/*
		 * Given a total due and an array representing the amount of change in your
		 * pocket, determine whether or not you are able to pay for the item. Change
		 * will always be represented in the following order: quarters, dimes, nickels,
		 * pennies.
		 * 
		 * To illustrate: changeEnough([25, 20, 5, 0], 4.25) should yield true, since
		 * having 25 quarters, 20 dimes, 5 nickels and 0 pennies gives you 6.25 + 2 +
		 * .25 + 0 = 8.50.
		 * 
		 */
		
		double suma = 0;
		double quarter = change[0] * 0.25;
		double dime = change[1] * 0.1;
		double nickel = change[2] * 0.05;
		double penny = change[3] * 0.01;

		suma = quarter + dime + nickel + penny;
		System.out.println("quarter " + quarter);
		System.out.println("dime " + dime);
		System.out.println("nickel " + nickel);
		System.out.println("penny " + penny);
		System.out.println("Amounty of money you have: " + suma);
		System.out.println("Yount of money you need to pay: " + amountDue);

		System.out.println();

		if (suma - amountDue >= 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 100, 20, 20, 75 }; // 1,75 + 2 + 1 + 0,75 = 5.50$
		double amount = 11.00;
		changeEnough(arr, amount);
		System.out.println(changeEnough(arr, amount));
	}

}
