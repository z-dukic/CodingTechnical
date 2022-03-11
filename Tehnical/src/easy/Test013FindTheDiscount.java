package easy;

public class Test013FindTheDiscount {
	
	public static double discount(int price, int percentage) {
		
		double priceFixed = (double) price;
		double percentageFixed = (double) percentage;
		
		double base = (priceFixed * percentageFixed)/100;
		double basePrice = priceFixed - base;
		System.out.println(basePrice);
		
		
		return basePrice;
		
	}
	

	public static void main(String[] args) {
		System.out.println(discount(593, 61));

	}

}
