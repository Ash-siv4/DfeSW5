package com.qa.exercises;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println(Calculator.add(12, 43));
		
		System.out.println(Calculator.multiply(12, 43));
		
		System.out.println(Calculator.sub(12, 43));
		
		System.out.println(Calculator.divideInt(5, 2));
		
		System.out.println(Calculator.divide(5, 2));
		
		
		Results.bio=20;
		Results.chem=100;
		Results.phys=125;
		
		System.out.println(Results.totalMark());
		System.out.println(Results.percent());
		
		
		//instance:
		//Results score = new Results();
		//score.bio=20;
		//score.percent();
	}

}
