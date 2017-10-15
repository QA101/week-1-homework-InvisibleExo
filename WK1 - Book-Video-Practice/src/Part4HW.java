
public class Part4HW {

	/*
* Write a program that will find sum, subtraction, multiplication and division
and if one number bigger than other true or false for:
1) x = 175 / y =255
2) x = 25.75 / y = 17.34
	 */
	
	
	public static void main(String[] args) {
		double x = 175, y = 255;
		System.out.println("Totals are for " + x + " and " + y + " are: ");
		System.out.println(addNum(x, y));
		System.out.println(subNum(x, y));
		System.out.println(multiplyNum(x, y));
		System.out.println(divideNum(x, y));
		System.out.println("Is Value 1 bigger than Value 2? " + whoBigger(x, y));
		System.out.println("\n x and y are getting new values.");
		x = 25.75; 
		y = 17.34;
		System.out.println("x is now: " + x + " and y is now: " + y);
		System.out.println("Totals are for " + x + " and " + y + " are: ");
		System.out.println(addNum(x, y));
		System.out.println(subNum(x, y));
		System.out.println(multiplyNum(x, y));
		System.out.println(divideNum(x, y));
		System.out.println("Is Value 1 bigger than Value 2? " + whoBigger(x, y));
		System.out.println("...... that's all folks.");
	}
	public static double addNum(double num1, double num2) {
		double total = num1 + num2;
		return total;
	}
	public static double subNum(double num1, double num2) {
		double total = num1 - num2;
		return total;
	}
	public static double multiplyNum(double the1, double the2) {
		double total = the1 * the2;
		return total;
	}
	public static double divideNum(double thing1, double thing2) {
		double total = thing1 / thing2;
		return total;
	}
	public static Boolean whoBigger(double num1, double num2) {
		Boolean bigFella = num1 > num2;
		if (num1 > num2) {
			return bigFella;
		}
		else {
			return bigFella;
		}
	}

}
