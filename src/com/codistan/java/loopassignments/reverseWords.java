package com.codistan.java.loopassignments;

import java.util.Arrays;

public class reverseWords {

	public static void main(String[] args) {

		String myString = "Hello World this is QA class Number 1 and we are doing great!";

		String[] strArray = myString.split(" ");// this is to convert the sentence to word array.
		Arrays.toString(strArray).length();
				
//		for (int i = 12; i > strArray.length; i--) {
//			System.out.print(strArray[i]);
//	}
		
			String[] strArray1 = myString.split(" ");
			System.out.print(strArray1);
			for (int j = 12; j > strArray.length; j--) {
				System.out.print(strArray[j]);
			}
		}
	}

// Assignment 5 (Interview Question): 
//		Please craete an application called reverseWords in com.codistan.java.loopassignments 
//		package. 
//		Please put the words of the following message in the reverse order
//		(words should be backwards): 
//		Hello World this is QA class Number 1 and we are doing great!
