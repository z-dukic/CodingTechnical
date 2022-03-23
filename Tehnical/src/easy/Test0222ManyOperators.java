package easy;

public class Test0222ManyOperators {

	// Some basic arithmetic operators are +, -, *, /, and %. In this challenge you
	// will be given three parameters, num1, num2, and an operator. Use the operator
	// on number 1 and 2.
	
	public class ArithmeticOps {
		  public static int operate(int a, int b, String op) {
		    switch (op) {
		      case "+":
		        return a + b;
		      case "-":
		        return a - b;
		      case "*":
		        return a * b;
		      case "/":
		        return a / b;
		      default:
		        return a % b;
		    }
		  }
		}
}
