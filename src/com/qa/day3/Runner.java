package com.qa.day3;

public class Runner {

	public static void main(String[] args) {

//		Arrays.array();
//		Arrays.arrayList();

		// -----------------STRING MANIPULATION
		// If you start off with a defined String, you can call methods on it to change
		// it

		// dataType variable_name = "value";
		//               012345678910
		String myName = "Hello World";
		System.out.println(myName);

		String hello = "Hello World";
		System.out.println(hello);

		System.out.println(myName == hello);// true or false - true

		String str = new String("Hello World");
		System.out.println(str);

		String str2 = new String("Hello World");
		System.out.println(str2);

		System.out.println(myName == str);// true or false - false
		System.out.println(myName.equals(str));// true or false - true

		System.out.println(myName.length());// 11
		System.out.println(myName.toLowerCase());// hello world
		System.out.println(myName.toUpperCase());// HELLO WORLD
		System.out.println(myName.charAt(6));// W
		System.out.println(myName.indexOf("l"));// 2
		//                              beginning index is inclusive
		System.out.println(myName.substring(6));// print everything from index 6 onwards - returns World
		//                   starts index - inclusive, end index - exclusive
		System.out.println(myName.substring(1, 6)); // ello 
		

	}

}
