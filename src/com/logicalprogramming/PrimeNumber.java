package com.logicalprogramming;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number To Check Prime Or Not: ");
		int input = scanner.nextInt();
		
		PrimeNumber pObj = new PrimeNumber();
		pObj.primeNumber(input);
		scanner.close();
	}
	
	void primeNumber(int number) {
		int temp = 0;
		for(int i = 2; i <= number - 1; i++) {
			
			if(number % i == 0) {
				temp += 1;
			}
		}
		
		if(temp > 0) {
			System.out.println("Not A Prime Number");
		} else {
			System.out.println("Prime Number");
		}
	}
}
