package com.logicalprogramming;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number To Check Given Number Is Perfect Number Or Not: ");
		int input = scanner.nextInt();
		scanner.close();
		
		perfectNumber(input);
	}
	
	static void perfectNumber(int number) {
		int sum = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		
		if (sum == number) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not Perfect Number");
		}
	}
}   