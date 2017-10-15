
public class Part4HWPt2 {

	/*
* Write a program that will change values of variables:
x=10 and y=5 => swap to make x=5 and y=10
x=2.5 and y=7.5 => swap to make x=7.5 and y=2.5
x=10 / y=5 / z=12 => swap to make x=12 / y=10 /z=5
	*/
	
	
	public static void main(String[] args) {
		double x = 10, y = 5, temp;
		System.out.println("Let's do a magic trick. First, x = " + x + " and y = " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("Now, x = " + x + " and y = " + y);
		System.out.println("Let's Try this again. First, x = " + x + " and y = " + y);
		x = 2.5;
		y = 7.5;
		System.out.println("Let's Try this again. First, x = " + x + " and y = " + y);
		temp = x;
		x = y; 
		y = temp;
		System.out.println("Now, x = " + x + " and y = " + y);
		x = 10;
		y = 5;
		double z = 12;
		double temp2;
		System.out.println("Let's Try this again. First, x = " + x + " , y = " + y + " and z = " + z);
		temp = x;
		x = z;
		temp2 = y;
		y = temp;
		z = temp2;
		System.out.println("Now, First, x = " + x + " , y = " + y + " and z = " + z);
		System.out.println("What a twist and now my head is spinning");

	}
	
	// Too frustrated to make this more easier to access through method for now. If I have time. Maybe later...
	// Maybe arrays?...
	/*public static void double theSwitch(double x, double y, double temp) {
		temp = x;
		x = y;
		y = temp;
		
	}*/
	

}
