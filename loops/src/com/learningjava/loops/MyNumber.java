package com.learningjava.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		if (number < 1) {
			return 0;
		}
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public void printANumberTriangle() {
		String message = "";
		for (int i = 1; i <= number; i++) {
			if (i == 1) {
				message = "" + i;
				System.out.println(message);
			} else {
				message = message + " " + i;
				System.out.println(message);
			}
		}
	}

	public void printANumberTriangle1() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
