package com.qa.day2;

public class Conditionals {

	// if-statements, if-else statements
	// Conditional - something that is dependent on a condition - result will be
	// either "true" or "false"

	// Equality Operators: ==, !=, >=, <=, >, <
	// Logical operators: &&, ||, &, |

	public static void ride(int age, int height) {
		// age > 12 and height > 120cm, can ride
		// age = 11
		// height =130cm

		// && - true and true
		// || - false and true, true and true
		if (age > 12 || height > 120) {
			System.out.println("can ride");
		} else {
			System.out.println("can't ride");
		}

	}

	public static void numbers(int num) {
		// VALUE = 2 -> F1, C0, ABC6, A1,
		if (num < 30) {// TRUE
			System.out.println("A");
			if (num < 20) {// TRUE
				System.out.println("B");
				if (num < 10) {// TRUE
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("E");
			}
		} else {
			System.out.println("F");
		}

	}

	public static String hotOrCold(int temp) {

		if (temp > 30) {
			return "turn on AC";
		} else if (temp == 30) {
			return "perfect temp";
		} else {
			return "turn on heater";
		}
	}

	public static String umbrella(boolean rain) {

		if (rain == true) {
			return "take umbrella";
		} else {
			return "don't take umbrella";
		}
	}

	// Switch cases
	// Defined set of conditions, e.g: days of the week, months, planets, hours,
	// names(on a small scale), menus

	public static void switchCase(String day) {
		switch (day.toLowerCase()) {
		case "monday":
			System.out.println("Day 1");
			break;
		case "tuesday":
			System.out.println("Day 2");
			break;
		case "wednesday":
			System.out.println("Day 3");
			break;
		case "thursday":
			System.out.println("Day 4");
			break;
		case "friday":
			System.out.println("Day 5");
			break;
		case "saturday":
			System.out.println("Day 6");
			break;
		case "sunday":
			System.out.println("Day 7");
			break;
		default:
			System.out.println("you haven't entered an actual day");
		}
	}

	
	public static void amOrPm(int h, int m) {
		boolean bool = h>=12 && h<=24;
		String str = ""+bool;
		switch (str) {
		case "true":
			break;
		case "false":
			break;
		default:
			System.out.println("");
		}
	}
}
