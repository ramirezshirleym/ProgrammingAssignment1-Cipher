/*
*  Programming Fundamentals
*  Summer 2020 - 2
*  NAME: Shirley Ramirez
*  PROGRAMMING ASSIGNMENT 1
*/

import java.util.Random;
import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		
		// Create Random and Scanner objects
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		// Generate random integer key for encoding
		int key = generator.nextInt(10);

		// Introduction
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Shirley Ramirez");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println();
		System.out.println("Welcome to the Cipher program.");

		// Read in valid entries
		// Declare variables for input
		int num1, num2, num3, num4, num5;

		System.out.println("Please enter 5 numbers between 0 and 19");
		System.out.print("1st number: ");
		num1 = scan.nextInt();
		
		// If num1 invalid, exit program
		if (num1 < 0 || num1 > 19) {
			System.out.print("Please read directions and try again!");
			scan.close();
			System.exit(0);
		}

		System.out.print("2nd number: ");
		num2 = scan.nextInt();

		// If num2 invalid, exit program
		if (num2 < 0 || num2 > 19) {
			System.out.print("Please read directions and try again!");
			scan.close();
			System.exit(0);
		}

		System.out.print("3rd number: ");
		num3 = scan.nextInt();

		// If num3 invalid, exit program
		if (num3 < 0 || num3 > 19) {
			System.out.print("Please read directions and try again!");
			scan.close();
			System.exit(0);
		}

		System.out.print("4th number: ");
		num4 = scan.nextInt();

		// If num4 invalid, exit program
		if (num4 < 0 || num4 > 19) {
			System.out.print("Please read directions and try again!");
			scan.close();
			System.exit(0);
		}

		System.out.print("5th number: ");
		num5 = scan.nextInt();

		// If num5 invalid, exit program
		if (num5 < 0 || num5 > 19) {
			System.out.print("Please read directions and try again!");
			scan.close();
			System.exit(0);
		}
		
		// Close scanner object 
		scan.close();

		// Encode input
		
		int sum = (num1 + num2 + num3 + num4 + num5);
		int digit1 = sum / 10;
		int digit2 = sum % 10;

		digit1 = (digit1 + key) % 10;
		digit2 = (digit2 + key) % 10;
		
		// Print out results
		System.out.println();
		System.out.println("Total = " + sum);
		System.out.println("Your random key is " + key);
		System.out.println(("Your encoded number is " + digit1) + digit2);

	}

}
