package com.qa.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
	
//	Create a project that has four methods; addition, subtraction, multiplication, and division:
//	All of these methods should take two numbers as parameters.
//	Create a menu to ask the user which of the four methods they wish to use, then take the numbers as user input
//	for the operation and output the result back to the user.
	
//	Using the prior project, take the division method and add exception handling for any attempts to divide by 0.
//	Stretch goal: Add exception handling for type mismatch.

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String decoration = "=======================================================================";
		int result = 0;
		boolean flag = true;

		do {

			System.out.println(
					"Type in your selection: \n \n(1 -- Addition, 2 -- Subtraction, 3 -- Multiplication, 4 -- Division)\n\n"
							+ decoration + "\nSelection: ");
			result = scanner.nextInt();
			System.out.println("\n");
			int a;
			int b;
			switch (result) {
				
				
			case 1:
				try {
					System.out.println("Enter the first number you wish to add: ");
					a = scanner.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("Invalid Number! Please try again!");
				}
				break;
			case 2:
				System.out.println("Enter the first number you wish to subract: ");
				a = scanner.nextInt();
				System.out.print("Enter the second number you wish to subtract: ");
				b = scanner.nextInt();
				System.out.print(decoration + "\nAnswer: " + Calculator.sub(a, b) + "\n\n");
				break;
			case 3:
				System.out.println("Enter the first number you wish to multiply: ");
				a = scanner.nextInt();
				System.out.print("Enter the second number you wish to multiply: ");
				b = scanner.nextInt();
				System.out.print(decoration + "\nAnswer: " + Calculator.multi(a, b) + "\n\n");
				break;
			case 4:
				System.out.println("Enter the first number you wish to divide: ");
				a = scanner.nextInt();
				System.out.print("Enter the second number you wish to divide: ");
				b = scanner.nextInt();
				System.out.print(decoration + "\nAnswer: " + Calculator.divi(a, b) + "\n\n");
				break;
			default:
				System.out.println("Please enter a valid number");
				flag = false;
				break;
			}

		} while (flag);

		scanner.close();

	}

}
