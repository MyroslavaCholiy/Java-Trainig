package com.codistan.java.loopassignments;

import java.util.Scanner;

public class simpleCalculator {

	public static void main(String[] args) {
		
		Scanner myCalc = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		char operator;
		double result=0.0;
				
		System.out.println("please enter the first number");
		num1 = myCalc.nextInt();
				
		System.out.println("please enter the second number");
		num2 = myCalc.nextInt();
		
		System.out.println("What operation do you want to use? ");
		operator = myCalc.next().charAt(0);
		
		switch (operator){
		case '+': result = num1+num2;
		break;
		case '-': result = num1-num2;
		break;
		case '*': result = num1*num2;
		break;
		case '/': result = num1/num2;
		break;
			
		}
		System.out.println(num1 + " "+operator +" "+ num2+ " is equal " +result);
		
		
		

//Assignment 7: Create an application called simpleCalculator 
//		in com.codistan.java.loopassignments package that asks this; 
//		Press 1 for addition, 
//		Press 2 for subtraction, 
//		Press 3 for multiplication, 
//		Press 4 for division. 
//		After that it will say this; 
//		please enter the first number, 
//		after getting the first user input, 
//		it will say please enter the second number, 
//		after getting this number the program should do the calculation based on the user inputs.

	}

}
