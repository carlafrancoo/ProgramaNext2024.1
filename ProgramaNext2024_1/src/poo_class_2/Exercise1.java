package poo_class_2;

import java.util.Scanner;

/*Create a program that, based on a temperature in degrees Celsius provided by the user, convert it and display it to 
Kelvin, Réaumur, Rankine and Fahrenheit, following the formulas:
	 Fahrenheit = Celsius * 1.8 + 32;
	 Kelvin = Celsius + 273.15;
	 Reaumur = Celsius * 0.8;
	 Rankine = Celsius * 1.8 + 32 + 459.67;*/


public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double Celsius, Fahrenheit, Kelvin, Reaumur, Rankine;
				
		System.out.println("Enter the value in degrees Celsius: ");
		Celsius = scanner.nextDouble();// input
		
		Fahrenheit = Celsius * 1.8 + 32;
		Kelvin = Celsius + 273.15;
		Reaumur = Celsius * 0.8;
		Rankine = Celsius * 1.8 + 32 + 459.67;
		
		System.out.println("The temperature in Fahrenheit is: " + Fahrenheit);
		System.out.println("The temperature in Kelvin is: " + Kelvin);
		System.out.println("The temperature in Réaumur is: " + Reaumur);
		System.out.println("The temperature in Rankine is: " + Rankine);
		
		scanner.close();
	}
}
