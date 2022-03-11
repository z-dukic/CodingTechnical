package veryEasy;

public class Test027SnailTravel {

	// A snail goes up the stairs. Every step, he must go up (distance = height of
	// step), then go to the next step (distance = length of step). He wants to
	// reach the top of the tower (tower height = tower).

	public static double TotalDistance(double height, double length, double tower) {

		 return (tower / height) * (height + length);
	}

	public static void main(String[] args) {
		System.out.println(TotalDistance(0.5,0.5,100));

	}

}
