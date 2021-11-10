package com.qa.exercises.arrays;

import java.util.ArrayList;

public class ArrayEx {

//	Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
//	Create a for loop that populates an integer array with values, outputting them at each iteration.
//	Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.

	public static int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

	public static void task1() {
		// for loop
		for(int in = 0; in<num.length;in++) {
			System.out.println("Number: " + num[in]);
		}
		System.out.println("--------------");
		//for-each loop
		for (int i : num) {
			System.out.println("Number: " + i);
		}
	}

	public static void task2() {
		ArrayList<Integer> array = new ArrayList<>();

		for (int i = 0; i < num.length; i++) {
			array.add(num[i]);
			System.out.println(array);
		}

		for (int index = 0; index < array.size(); index++) {
			array.set(index, array.get(index) * 10);
			System.out.println(array);
		}

	}

}
