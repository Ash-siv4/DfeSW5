package com.qa.day2;

public class Iteration {

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
		while(str == "y") {
			System.out.println("Selected yes");
			System.out.println("Do you want to exit (y/n)?");
			str = "n";// usually a user input would be detected here
		}
	}
	
	public static void realWorld(String str) {
		System.out.println("do you want to see your sched (y/n)?");
		while(str == "y") {
			String day = "tuesday";
			switch(day) {
			case "monday":
				System.out.println("you can sleep");
				break;
			case "tuesday":
				System.out.println("do work!");
				break;
			}
			System.out.println("Do you want to see another day (y/n)?");
			str = "n";// usually a user input would be detected here
		}
		
	}
	
	
	

}
