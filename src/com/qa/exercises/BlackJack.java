package com.qa.exercises;

public class BlackJack {

//	Given 2 integer values greater than 0, 
//	return whichever is closest to 21 without going over 21. 
//	If they both go over 21 then return 0.
//
//			 play (10, 21) -> 21
//			 play (20, 18) -> 20
//			 play (1, 22) -> 1
//			 play (22, 23) -> 0

	//                          10        21
	public static void play(int num1, int num2) {
		if (num1 > 0 && num2 > 0) {// 10>0 && 21>0
			if(num1>num2) {
				if(num1>21 && num2>21) {
					System.out.println("0");
				}else {
					if(num1<=21) {
						System.out.println(num1);
					}else {
						System.out.println(num2);
					}
				}
			}else {
				if(num1>21 && num2>21) {
					System.out.println("0");
				}else {
					if(num2<=21) {
						System.out.println(num2);
					}else {
						System.out.println(num1);
					}
				}
			}
		}
	}

}
