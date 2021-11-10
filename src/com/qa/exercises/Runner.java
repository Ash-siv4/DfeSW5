package com.qa.exercises;

import com.qa.exercises.conditionals.BlackJack;
import com.qa.exercises.conditionals.FizzBuzz;
import com.qa.exercises.conditionals.Flowcharts;
import com.qa.exercises.conditionals.Taxes;
import com.qa.exercises.iteration.Coins;
import com.qa.exercises.iteration.FlowchartsLoop;
import com.qa.exercises.iteration.Numbers;
import com.qa.exercises.operators.Calculator;
import com.qa.exercises.operators.Results;

public class Runner {

	public static void main(String[] args) {
		// -------------------------------------------OPERATORS EXERCISES
		// CALCULATOR TASK
		System.out.println(Calculator.add(12, 43));
		System.out.println(Calculator.multiply(12, 43));
		System.out.println(Calculator.sub(12, 43));
		System.out.println(Calculator.divideInt(5, 2));
		System.out.println(Calculator.divide(5, 2));
		// RESULTS TASK
		Results.bio = 20;
		Results.chem = 100;
		Results.phys = 125;
		System.out.println(Results.totalMark());
		System.out.println(Results.percent());
		// instance:
		// Results score = new Results();
		// score.bio=20;
		// score.percent();

		// -------------------------------------------CONDITIONALS EXERCISES
		// CALCULATOR REVISITED TASK

		// RESULTS REVISITED TASK

		// FLOWCHARTS TASK
		Flowcharts f = new Flowcharts();
		f.flow(3340);

		// BLACKJACK TASK
		BlackJack.play(10, 21); // 21
		BlackJack.play(20, 18); // 20
		BlackJack.play(1, 22); // 1
		BlackJack.play(22, 23); // 0

		// UNIQUE SUM TASK

		// TAXES TASK
		int salary = 30000;
		System.out.println("Tax for salary of " + salary + " = " + Taxes.method1(salary) + "%");
		System.out.println("Taxed amount for salary of " + salary + " = " + Taxes.method2(salary));

		// FIZZBUZZ TASK
		System.out.println(FizzBuzz.fizzBuzz(24));// multiple of 3 -> fizz
		System.out.println(FizzBuzz.fizzBuzz(25));// multiple of 5 -> buzz
		System.out.println(FizzBuzz.fizzBuzz(60));// multiple of 3&5 -> fizzbuzz
		System.out.println(FizzBuzz.fizzBuzz(11));// neither -> input number: 11

		// -------------------------------------------ITERATION EXERCISES

		// NUMBERS TASK
		Numbers num = new Numbers();
		System.out.println(num.task2(1));
		System.out.println(num.task2(11));
		System.out.println(num.task2(21));

		// FLOWCHARTS TASK
		FlowchartsLoop flowLoop = new FlowchartsLoop();
		flowLoop.flow1();
		flowLoop.flow2();
		flowLoop.flow3();
		flowLoop.flow4();

		// NUMBERS REVISITED TASK

		// COINS TASK
		Coins test = new Coins();
		test.change(4.58, 20);

	}

}
