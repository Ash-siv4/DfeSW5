package com.qa.day2;

import java.util.Scanner;

public class Iteration {

	// CREATE INSTANCE OF A CLASS
	// class_name variable_name = new class_name();

	public static Scanner sc = new Scanner(System.in);

	// Iteration/looping:
	// - for-loop -> defined condition/set number of times for the loop, when you
	// know the end (e.g. count to 100, 100 is the end)
	// - while loop -> executes as long as a condition is true (e.g. as long as a
	// user inputs something)
	// - do-while loop -> this is the same as a while loop (executes at least once
	// regardless of if the condition is false)

	public static void forLoop(int i) {
		// for-loop has 3 parts to it
		// for(initialiser;condition;increment)
		for (int counter = 0; counter <= i; counter += 2) {
			System.out.println(counter);//
		}
	}

	public static void timesTable(int table) {
		// 1<=12
		for (int counter = 0; counter <= 12; counter++) {
			int times = table * counter;// times = 5*1
			System.out.println(table + " * " + counter + " = " + times);
		}
	}

	public static void whileLoop(String str) {
		while (str == "y") {
			System.out.println("Selected yes");
			System.out.println("Do you want to exit (y/n)?");
			str = "n";// usually a user input would be detected here
		}
	}

	public static void realWorld() {
		System.out.println("do you want to see your sched (y/n)?");
		String str = sc.nextLine();
		// don't do str == "y", use the .equaLs method from the string class
		while (str.toLowerCase().equals("y")) {
			System.out.println("enter the day you want to see: ");
			String day = sc.nextLine();
			switch (day.toLowerCase()) {
			case "monday":
				System.out.println("you can sleep");
				break;
			case "tuesday":
				System.out.println("do work!");
				break;
			case "wednesday":
				System.out.println("half way there");
				break;
			case "thursday":
				System.out.println("almost over");
				break;
			case "friday":
				System.out.println("freedom!!");
				break;
			default:
				System.out.println("weekend?");
			}
			System.out.println("Do you want to see another day (y/n)?");
			str = sc.nextLine();// usually a user input would be detected here
		}
	}

	public static void whileL() {
		System.out.println("------------while---------");
		int count = 3;
		while (count < 3) {
			count++;
			System.out.println(count);
		}
	}

	public static void doWhileL() {
		System.out.println("------------do-while---------");
		int count = 3;
		
		do{
			count++;
			System.out.println(count);
		}
		while(count<3);
	}

}
