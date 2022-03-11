package medium;

public class Test002RockPaperScissors {
	/*
	 * Create a function which simulates the game "rock, paper, scissors". The
	 * function takes the input of both players (rock, paper or scissors), first
	 * parameter from first player, second from second player. The function returns
	 * the result as such:
	 * 
	 * "Player 1 wins" "Player 2 wins" "TIE" (if both inputs are the same) The rules
	 * of rock, paper, scissors, if not known:
	 * 
	 * Both players have to say either "rock", "paper" or "scissors" at the same
	 * time. Rock beats scissors, paper beats rock, scissors beat paper.
	 */

	public static String rps(String s1, String s2) {

		String rock = "rock";
		String scissors = "scissors";
		String paper = "paper";

		if ((s1 == rock && s2 == rock) || (s1 == scissors && s2 == scissors) || (s1 == paper && s2 == paper)) {
			return "TIE";
		}
		if ((s1 == rock && s2 == scissors) || (s1 == scissors && s2 == paper) || (s1 == paper && s2 == rock)) {
			return "Player 1 wins";

		} else {
			return "Player 2 wins";
		}

	}

	public static void main(String[] args) {
		System.out.println(rps("paper", "paper"));
		//No invalid entry like "pappper"
	}

}
