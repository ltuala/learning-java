package com.learningjava.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(50);
		Book effectiveJava = new Book(60);
		Book cleanCode = new Book(70);

		artOfComputerProgramming.setNoOfCopies(100);
		artOfComputerProgramming.increaseNoOfCopies(50);
		effectiveJava.setNoOfCopies(500);
		cleanCode.setNoOfCopies(45);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
	}

}
