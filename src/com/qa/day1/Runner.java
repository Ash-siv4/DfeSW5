package com.qa.day1;

//run the main method - the start of the app
public class Runner {
	// scope is defined by {-start, }-end

	// This is a comment
	// Type "main" then hit ctrl+space then hit enter

	// To declare a method you need the following:
	// - access modifier: public, private, protected, default
	// - return type: the data type we want the method to return
	// - method name: what you want to name the method (camelCase)
	// - parameters: arguments/inputs to pass into the method(data type & name= int a)
	// - declare scope with { }
	// - return statement should be the last line of the method before the close }

	// entry point
	public static void main(String[] args) {
		System.out.println("Hello world, I rule all!!! XD");
		// shortcut for print: type sysout then hit ctrl+space
		// only way to see anything in the console is if you print it
		System.out.println();

		HelloWorld.hello(); // calls the hello method - this won't output to the console
		System.out.println(HelloWorld.hello()); // print out what the hello method returns

		// System.out.println(printHello()); - cannot print a method which returns a
		// void
		HelloWorld.printHello();// calling the printHello() method from HelloWorld class
		
		//how to call a non-static method
		DataTypes temp = new DataTypes();// instantiate class
		temp.printVariables();
		
		//calling a static method
		System.out.println(Operators.power(20));
		
	}

}