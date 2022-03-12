package medium;

public class Test003CrowdedCarriageCapacity {

	// A train has a maximum capacity of n passengers overall, which means each
	// carriage's capacity will share an equal proportion of the maximum capacity.

	// Create a function which returns the index of the first carriage which holds
	// 50% or less of its maximum capacity. If no such carriage exists, return -1.

	// 305

	public static int findSeat(int n, int[] arr) {

		double seatsPerVagon = n / arr.length;
		//System.out.println("Seats per vagon " + seatsPerVagon);
		//System.out.println("lenght " + arr.length);
		int counter = -1;
		for (int i = 0; i < arr.length; i++) {
			/*
			 * System.out.println("People in vagon " + arr[i]);
			 * System.out.println("Seats per vagon " + seatsPerVagon);
			 * System.out.println("% of people in vagon " + (arr[i] / seatsPerVagon) * 100);
			 */

			double percentageOfPeopleInVagon = arr[i] / seatsPerVagon * 100;

			counter = counter + 1;

			
			if (percentageOfPeopleInVagon <= 50.00) {

				System.out.println();
				System.out.println("The answer is " + arr[i]);
				System.out.println("The answer is %: " + percentageOfPeopleInVagon);
				System.out.println("Counter: " + counter);
				System.out.println("arr.lenght: " + arr.length);
				System.out.println();

				break;

			}
			
			if (counter >= arr.length-1) {
				System.out.println("Hello world");
				return -1;

			}

		}

		return counter;
	}

	public static void main(String[] args) {
		int noOfSeats = 200;
		int[] peoplePerVagon = { 35, 23, 27, 14, 38 };

		findSeat(noOfSeats, peoplePerVagon);
		System.out.println(findSeat(noOfSeats, peoplePerVagon));

	}

}
