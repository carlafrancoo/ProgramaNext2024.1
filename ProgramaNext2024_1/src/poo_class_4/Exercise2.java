package poo_class_4;

import java.util.Scanner;

/*
Create a program, containing two vectors A and B each with 10 integer elements. 

Then construct a vector C, using repeating structures, where each element of C is the sum of the respective elements in A and B, that is:
 
C[i] = A[i] + B[i].
*/

public class Exercise2 {
	
	public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);
		
		int[] vectorA = new int[10];
		int[] vectorB = new int[10];
		int[] vectorC = new int[10];

		for (int i = 0; i < vectorA.length; i++) {
			System.out.println("Enter the position value of vector A: " + i);
			vectorA[i] = input.nextInt();
			System.out.println("Enter the position value of vector B: " + i);
			vectorB[i] = input.nextInt();
		}

		for (int i = 0; i < vectorA.length; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
		}

		for (int i = 0; i < vectorC.length; i++) {
			System.out.println("The values for arrayC are: " + vectorC[i]);
		}
		input.close();
	}
}
