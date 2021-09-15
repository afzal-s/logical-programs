package com.logicalprogramming;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter A Number To Get Reverse: ");
		int input = scanner.nextInt();

		ReverseNumber rObject = new ReverseNumber();
		rObject.reverseNumber(input);
		scanner.close();
	}

	void reverseNumber(int number) {

		int reminder = 0, reverse = 0;

		while (number != 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reverse Number: " + reverse);
	}
}
