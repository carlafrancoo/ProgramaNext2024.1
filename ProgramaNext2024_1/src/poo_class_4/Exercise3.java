package poo_class_4;

import java.util.Scanner;

/*
You have a data set containing height and gender (male, female) of 10 people. 
Make an algorithm that calculates and writes: 
The highest and lowest height of the group; 
The average height of men; 
The number of women.
*/

public class Exercise3 {

	public static void main(String[] args) {
		int gender, womenCount = 0, menCount = 0;
		float height, menSum = 0, menAverage = 0, bigger = 0, lowest = 0;

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Choose the person's gender (1-Female, 2-Male): ");
			gender = input.nextInt();
			System.out.print("Enter the height: ");
			height = input.nextFloat();
			if (gender == 1) {
				womenCount++;
			} else if (gender == 2) {
				menCount++;
				menSum  = menSum  + height;
			} else {
				System.out.println("Invalid Gender Option!");
			}
			if (height > bigger) {
				bigger = height;
			} else if (height < lowest) {
				lowest = height;
			}
		}
		menAverage = menSum  / menCount;

		System.out.println("The highest height of the group is " + bigger + " m, and the smallest is " + lowest + " m");
		System.out.println("The average height of men is " + menAverage + " m");
		System.out.println("The number of women is " + womenCount);

		input.close();
	}
}
		
