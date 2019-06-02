package MyJavaHomeWorkSevenClasses;

import java.util.Scanner;

public class CounterAplication {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the number you want to count by: ");
		
		int userNumber = userInput.nextInt();
		int count = userNumber; //number has to be increese / decrease
		
		for (int i = count; i<=100; i=i+count ){
			System.out.println(i);
		}
		
		
		
		
		
//		Assignment 2: Please create an application called CounterAplication in com.codistan.java.loopassignments package. 
//		This application will ask “please enter the number you want to count by:” the. 
//		The program will start counting until 100 by the number user input. 
//		For example if the user input is 5 then the application will start counting as 5, 10, 15, ... 
//		or if the user input is 3 then it will count by 3 as 3, 6, 9, …

	}

}
