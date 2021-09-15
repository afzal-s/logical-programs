package com.logicalprogramming;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number To Generate Fibonacci Series: ");
		int input = scanner.nextInt();
		
		FibonacciSeries fObj = new FibonacciSeries();
		fObj.Fibonacci(input);
		scanner.close();
	}
	
	void Fibonacci(int number) {
		int numOne = 0, numTwo = 1;
		int counter = 0;
		System.out.print(numOne + " " + numTwo + " ");
		
		for (int i = 1; i <= number; i++) {
			counter = numOne + numTwo;
			System.out.print(counter + " ");
			
			numOne = numTwo;
			numTwo = counter;
		}
	}
}