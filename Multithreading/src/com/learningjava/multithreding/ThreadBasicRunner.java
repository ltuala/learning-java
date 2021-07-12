package com.learningjava.multithreding;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("\n[INFO] Task1 Started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n[INFO] Task1 Done");
	}
}

public class ThreadBasicRunner {
	public static void main(String[] args) {
		System.out.println("\n[INFO] Task1 Kicked Off");
		Task1 task1 = new Task1();
		task1.start();

		System.out.println("\n[INFO] Task2 Kicked Off");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nINFO] Task2 Done");

		System.out.println("\n[INFO] Task3 Kicked Off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nINFO] Task3 Done");

		System.out.println("Main Done");
	}
}
