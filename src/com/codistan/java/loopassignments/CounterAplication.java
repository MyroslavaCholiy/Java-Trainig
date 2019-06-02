package com.codistan.java.loopassignments;

import java.util.Scanner;

public class CounterAplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number you want to count by");
		int userInput = input.nextInt();
		
		int count=userInput;
		
		for(int i=count; i<=100; i=i+count) {
			System.out.println(i);
		}
		
		

	}

}
