package easy;

public class Test010SayHelloSayBye {
	// Write a function that takes a string name and a number num (either 0 or 1)
	// and return "Hello" + name if num is 1, otherwise return "Bye" + name.

	public static String sayHelloBye(String name, int num) {
		
		String firstName = name.substring(0,1).toUpperCase() + name.substring(1,name.length());
		System.out.println(firstName);
		
		if(name != null && num == 1) {
			return "Hello " + firstName;
		}else {
			return "Bye " + firstName;
		}
	}

	public static void main(String[] args) {
		System.out.println(sayHelloBye("pero", 0));

	}

}
