package easy;

import java.util.Arrays;

public class Test009ShuffleTheNameArray {
	
	public static String nameShuffle(String s) {
	      
		//
		String[] nameAndSurname = s.split(" ");
		System.out.println(Arrays.toString(nameAndSurname));
		
		String name = nameAndSurname[0];
		
		String lastName = nameAndSurname[1];
		
		
		return lastName + " " + name;
		
}
	

	public static void main(String[] args) {

		System.out.println(nameShuffle("donald trump"));
		

	}

}
