package poo_class_3;

public class Comparison {
	
  /*
    Create a class called Comparison and create the main method in this class. 
    
	In the main method, implement a program that has three local variables: x, y, and z (with your values or provided by the user). 
	
    Print the numbers in ascending order.
    */


	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		int z = 1;

		if (x <= y && x <= z && y <= z) {
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		} else if (x <= y && x <= z && z <= y) {
			System.out.println(x);
			System.out.println(z);
			System.out.println(y);
		} else if (y <= x && y <= z && x <= z) {
			System.out.println(y);
			System.out.println(x);
			System.out.println(z);
		} else if (y <= x && y <= z && z <= x) {
			System.out.println(y);
			System.out.println(z);
			System.out.println(x);
		} else if (z <= x && z <= y && x <= y) {
			System.out.println(z);
			System.out.println(x);
			System.out.println(y);
		} else {
			System.out.println(z);
			System.out.println(y);
			System.out.println(x);
		}
	}
}

