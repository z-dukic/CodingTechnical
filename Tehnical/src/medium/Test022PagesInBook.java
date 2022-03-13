package medium;

public class Test022PagesInBook {

	// Suppose that you add all of the page numbers in a book. If the total is 21,
	// the book could only have 6 pages because 1 + 2 + 3 + 4 + 5 + 6 = 21. If I had
	// said the total were 25, that would be impossible because the next number in
	// the series is 28 (21 + 7).

	// Create a function that, given the total number of pages as an argument,
	// returns true if it is a valid total and false if it is not.

	// Can you devise a solution that is more efficient than simply adding
	// consecutive integers as I did above?

	// pagesInBook(5) ➞ false

	// pagesInBook(4005) ➞ true

	public static boolean pagesInBook(int total) {

		int sum = 0;

		for (int i = 0; i <= total; i++) {
			sum = sum + i;
			System.out.println(sum);
			if (sum == total) {
				return true;
			}

		}

		return false;

	}

	public static void main(String[] args) {
		System.out.println(pagesInBook(21));

	}

}
