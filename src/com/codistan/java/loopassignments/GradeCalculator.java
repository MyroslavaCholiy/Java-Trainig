package com.codistan.java.loopassignments;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		System.out.println("What is your name: ");
		String enterdName = myScanner.nextLine();

		System.out.println("Write your score:");
		int score = myScanner.nextInt();

		if (score >= 85 && score < 120) {
			System.out.println("Your Grade is “A”");
		} else if (score >= 75) {
			System.out.println("Your Grade is “B”");
		} else if (score >= 65) {
			System.out.println("Your Grade is “C”");
		}else if (score >= 55) {
			System.out.println("Your Grade is “D”");
			}
			else if (score < 55) {
				System.out.println("Your Grade is “F”");
			}else {
				System.out.println("Your input is wrong");
			}

}

}
