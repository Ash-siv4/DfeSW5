package com.qa.day1;

public class Runner {

	// This is a comment
	// Type "main" then hit ctrl+space then hit enter
	
	//To declare a method you need the following:
	// - access modifier: public, private, protected, default
	// - return type: the data type we want the method to return
	// - method name: what you want to name the method (camelCase)
	// - parameters: arguments/inputs to pass into the method(data type & name= int a)
	// - declare scope with { }
	// - return statement should be the last line of the method before the close }
	
	//entry point
	public static void main(String[] args) {
		
		hello(); //calls the hello method - this won't output to the console
		System.out.println(hello()); // print out what the hello method returns
		
		System.out.println("Hello world, I rule all!!! XD");
		//shortcut for print: type sysout then hit ctrl+space
		// only way to see anything in the console is if you print it
		System.out.println();	
	}
	
	public static String hello() {
		return "hello";
	}

}

