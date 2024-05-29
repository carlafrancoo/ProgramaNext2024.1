package poo_class_2;

import java.util.Scanner;

/*Write a program to determine the amount of horses needed to lift a mass, to a certain height in seconds. 
Consider horses = (mass * height / time) / 745.6999*/

public class Exercise3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        double mass, height, time, horses;
        
        System.out.print("Enter the value of the mass: ");
		mass = input.nextDouble();
		System.out.print("Enter the value of the height: ");
		height = input.nextDouble();
		System.out.print("Enter the value of the time: ");
		time = input.nextDouble();
		
        horses = (mass * height / time) / 745.6999;

        System.out.println("The amount of horses needed is " + horses);
        
        input.close();
    }

}
