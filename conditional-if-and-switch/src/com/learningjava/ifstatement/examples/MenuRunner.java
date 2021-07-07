package com.learningjava.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number 1: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter number 2: ");
		int number2 = scanner.nextInt();

		System.out
				.print("Choices available are:\n1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply\nChoose Operation: ");
		int choice = scanner.nextInt();

		System.out.println("Your choices are:");
		System.out.println("Number 1: " + number1);
		System.out.println("Number 2: " + number2);
		System.out.println("Choice: " + choice);

		if (choice == 1) {
			System.out.println("Result: " + (number1 + number2));
		} else if (choice == 2) {
			System.out.println("Result: " + (number1 - number2));
		} else if (choice == 3) {
			System.out.println("Result: " + (number1 / number2));
		} else if (choice == 4) {
			System.out.println("Result: " + (number1 * number2));
		} else {
			System.out.println("Invalid operation.");
		}
	}

}
