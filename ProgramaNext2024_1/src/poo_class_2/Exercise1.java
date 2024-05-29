package poo_class_2;

import java.util.Scanner;

/*
 Create a program that, based on a temperature in degrees Celsius provided by the user, convert it and display it to
 Kelvin, Réaumur, Rankine and Fahrenheit, following the formulas:

	 Fahrenheit = Celsius * 1.8 + 32;
	 Kelvin = Celsius + 273.15;
	 Reaumur = Celsius * 0.8;
	 Rankine = Celsius * 1.8 + 32 + 459.67;
	 */


public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double celsius, fahrenheit, kelvin, reaumur, rankine;
				
		System.out.println("Enter the value in degrees Celsius: ");
		celsius = scanner.nextDouble();// input
		
		fahrenheit = celsius * 1.8 + 32;
		kelvin = celsius + 273.15;
		reaumur = celsius * 0.8;
		rankine = celsius * 1.8 + 32 + 459.67;
		
		System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
		System.out.println("The temperature in Kelvin is: " + kelvin);
		System.out.println("The temperature in Réaumur is: " + reaumur);
		System.out.println("The temperature in Rankine is: " + rankine);
		
		scanner.close();
	}
}
