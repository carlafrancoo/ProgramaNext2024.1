package poo_class_2;

import java.util.Scanner;

/*Create a program that calculates the average salary of 4 employees of a company, asking the user for the 
employee salaries, and returning the average salary*/

public class Exercise2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salary1, salary2, salary3, salary4, average;
		
		System.out.print("Enter the salary of the first employee: ");
		salary1 = input.nextDouble();
		System.out.print("Enter the salary of the first employee: ");
		salary2 = input.nextDouble();
		System.out.print("Enter the salary of the third employee: ");
		salary3 = input.nextDouble();
		System.out.print("Enter the salary of the fourth employee: ");
		salary4 = input.nextDouble();

		average = (salary1 + salary2 + salary3 + salary4) / 4;
		System.out.println("The average salary of the company's employees is R$ " + average);
		
		input.close();
	}

}
