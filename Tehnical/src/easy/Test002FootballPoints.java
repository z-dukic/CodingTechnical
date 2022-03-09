package easy;

public class Test002FootballPoints {

// Create a function that takes the number of wins, draws and losses and
// calculates the number of points a football team has obtained so far.

//wins get 3 points
//draws get 1 point
//losses get 0 points

	public static int footballPoints(int wins, int draws, int loses) {

		return wins * 3 + draws * 1 + loses * 0;
	}

}
