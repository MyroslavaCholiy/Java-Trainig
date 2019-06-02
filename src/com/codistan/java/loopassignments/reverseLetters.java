package com.codistan.java.loopassignments;

import java.lang.reflect.Array;
import java.util.Scanner;

public class reverseLetters {

	public static void main(String[] args) {
		
		//1-st method
//		Scanner myScanner = new Scanner(System.in);
//
//		System.out.println("Hello World this is QA class Number 1 and we are doing great!");
//
//		String str = "Hello World this is QA class Number 1 and we are doing great!";
//
//		String reverse = " ";
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			reverse = reverse + str.charAt(i);
//		}
//
//		System.out.println(reverse);

		// 2-nd method

//        Scanner read = new Scanner(System.in);
//       
//        String str = "Hello World this is QA class Number 1 and we are doing great!";
//        
//        StringBuilder sb = new StringBuilder();
//        
//        for(int i = str.length()- 1; i >= 0; i--)
//        {
//            sb.append(str.charAt(i));
//        }
//        
//        System.out.println("Reversed string is:");
//        System.out.println(sb.toString());

		// 3-rd method

//		System.out.println("Hello World this is QA class Number 1 and we are doing great!");
//
//		Scanner read = new Scanner(System.in);
//		String str = "Hello World this is QA class Number 1 and we are doing great!";
//
//		StringBuilder sb = new StringBuilder(str);
//
//		System.out.println("Reversed string is:");
//		System.out.println(sb.reverse().toString());
	
	//4-th method
			
		
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.print("Hello World this is QA class Number 1 and we are doing great");
//		
//		String str ="Hello World this is QA class Number 1 and we are doing great";			
//		char[] word = str.toCharArray(); 
//		
//		System.out.println(" "); 
//	
//		int j=word.length;
//		
//		for(int i=j;i>0;i--) {
//		System.out.print(word[i-1]);
//	      }
		
		//5-th method
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Hello World this is QA class and we are doing great!\r\n" + 
				"");
		
		StringBuilder str = new StringBuilder("Hello World this is QA class and we are doing great!").reverse();
	
		System.out.println(str);
		
		
	}
		
	}

