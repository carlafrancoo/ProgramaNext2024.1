package poo_class_4;

import java.util.Scanner;

/*
Create a program, containing a vector A with 5 integer elements. 

Then construct a vector B of the same type and size, using repeating structures to place the elements of vector A multiplied by 2 inside the vector B, that is: 
 
B[i] = A[i] * 2.
*/

public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vectorA = new int[5];
		int[] vectorB = new int[5];

		for (int i = 0; i < vectorA.length; i++) {
			System.out.println("Enter the position value: ");
			vectorA[i] = input.nextInt();
		}
		System.out.print("The vectorB is:{");
		for (int i = 0; i < vectorB.length; i++) {
			vectorB[i] = vectorA[i] * 2;
			if (i == 4) {
				System.out.print(vectorB[i]);
			} else {
				System.out.print(vectorB[i] + ",");
			}
		}
		System.out.print("}");

		input.close();
	}

}
