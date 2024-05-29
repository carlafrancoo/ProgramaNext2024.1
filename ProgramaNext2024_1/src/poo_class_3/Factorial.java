package poo_class_3;

import java.util.Scanner;

/*
Create a class called Factorial and create the main method in this class. 
In the main method, implement a program that reads a keypad number, and then prints its factorial.*/ 

public class Factorial {
	
		public static void main(String[] args) {
		
		// add numbers from 1 to N = 1 + 2 + ... + (N-1) + N
		// N! = 1x2x3x...x(N-1)xN
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter an integer: ");
				int number = scanner.nextInt();
				if (number < 0) {
					System.out.println("There is no negative number factorial: ");
				} else {
					int accumulator = 1;
					for (int i = 1; i <= number; i++) {
						accumulator = accumulator * i;
					}
					System.out.println("Factorial: " + accumulator);
					
				scanner.close();
		}
	}
}
