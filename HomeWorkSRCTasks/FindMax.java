import java.util.Scanner;
public class FindMax {

	/*
	 * Define a program that finds the maximum number when 2 numbers are given.
	 */
	public static void main(String[] args) {
		System.out.println("Now how do I find max....");
		takeItToMax();
	}
	public static void takeItToMax() {
		int num1, num2;
		System.out.println("Which your two numbers of choice is bigger? \nPlease enter your two numbers: ");
		Scanner type = new Scanner(System.in);
		num1 = Integer.parseInt(type.nextLine());
		System.out.println("Now enter a number for the second: ");
		num2 = Integer.parseInt(type.nextLine());
		System.out.println("Survey says: " + Math.max(num1, num2));
		//To close the scanner object.
		type.close();
	}

}
