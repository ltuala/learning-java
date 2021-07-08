package com.learningjava.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String maxlength = "";
		for (String day : daysOfWeek) {
			if (maxlength.length() < day.length()) {
				maxlength = day;
			}
		}
		System.out.println("Day with most number of characters: " + maxlength);

		for (int i = 0; i < daysOfWeek.length; i++) {
			System.out.print(daysOfWeek[(daysOfWeek.length - 1) - i] + " ");
		}

//		or
//		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
//			System.out.print(daysOfWeek[i] + " ");
//		}
	}

}
