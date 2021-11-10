package com.qa.exercises.conditionals;

public class FizzBuzz {
//	Create a method which returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
//	Return 'FizzBuzz' for numbers which are multiples of both three and five.
//	Return the input number for numbers that are neither.

	public static String fizzBuzz(int number) {
		if (number % 3 == 0) {
			if (number % 3 == 0 & number % 5 == 0) {
				// System.out.println("fizzbuzz");
				return "fizzbuzz";
			} else {
				// System.out.println("fizz");
				return "fizz";
			}
		} else if (number % 5 == 0) {
			// System.out.println("buzz");
			return "buzz";
		} else {
			return "input number: " + number;

		}
	}

}
