package veryEasy;

public class Test011NumberInPolygon {
	
	//sum of angles in polygon
	public static int sumOfAngles(int n) {
		
	    if (n < 3)
	        return 0;
	    return (n - 2) * 180;
		}
}
