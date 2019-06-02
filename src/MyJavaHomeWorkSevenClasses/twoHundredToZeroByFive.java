package MyJavaHomeWorkSevenClasses;

public class twoHundredToZeroByFive {

	public static void main(String[] args) {

		int start = 200;
		int end = 0;
			
		for (int j = 200; j >= 0; j = j - 5) {
			System.out.println(j);
		}

		while (start > end) {
			start-= 5;
			System.out.println(start);

		}
		do {
			start-= 5;
			System.out.println(start);
			
		}while(start > end); 
		
		}
		

//		Assignment 3: Please create an application called twoHundredToZeroByFive 
//		in com.codistan.java.loopassignments package that counts from 200 to 0 by 5 
//		in three different ways, 
//		1- for loop, 2- while, 3- do while.

	}

