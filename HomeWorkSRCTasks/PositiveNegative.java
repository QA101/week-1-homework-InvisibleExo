import java.util.Scanner;

public class PositiveNegative {

	/*
	 * define a program that finds if a number is positive or negative.
	 * 
	 * The program should print positive if the number is positive, negative if it is negative
	 */
	public static void main(String args[]){
		positiveOrNegative();
	}
	
	public static void positiveOrNegative() {
		int x;
		Scanner judge = new Scanner(System.in);
		System.out.println("Type in your number: ");
		x = Integer.parseInt(judge.nextLine());
			if ( x < 0 ) {
				System.out.println("Negative.");
			}
			else if (x > 0) {
				System.out.println("Positive.");
			}

			else if (x == 0) {
				System.out.println("Really? Are you trying to do bit right now?");
				System.out.println("Fine, whatever, enter your value again. No \"0\" this time. "); 
			} 
		judge.close();
		//Will try to get back at this at a latter time after doing the other homework. (This is part is to challenge me, for the most part.); to figure out a simple solution for cases where String or char are entered into the x variable.
		//Looked at several methods, but they included a lot of nestings, try catch/exceptions.
		//Possible solution: see if input isDigit method for int/double instead of char data types. Hopefully more simple.
	}
}
