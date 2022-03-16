package easy;

import java.util.Arrays;

public class Test021FindTheBomb {

	// Write a function that finds the word "bomb" in the given string (not case
	// sensitive). Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".

	public static String bomb(String str) {

		String[] array = str.toLowerCase().split(" !.");
		System.out.println(array.length);
		 
		System.out.println(Arrays.toString(array));
		
		
		for (int i = 0; i <= array.length; i++) {
			if(array[i].toLowerCase().contains("bomb")) {
				System.out.println(Arrays.toString(array));
				return "DUCK!";
			}else {
				System.out.println(Arrays.toString(array));
				return "Relax, there's no bomb.";
			}
		}
		return "pero";
	}

	public static void main(String[] args) {
		System.out.println(bomb("There is a bomb!"));
	}

}
