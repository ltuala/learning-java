package com.learningjava.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		Student student = new Student("Leo", 98, 97, 100);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks : " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks : " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("maximum marks : " + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("minimum marks : " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("average mark : " + average);
	}

}
