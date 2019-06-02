package com.codistan.java.loopassignments;

public class twoHundredToZeroByFive {

	public static void main(String[] args) {
		

		for (int i = 200; i >= 0; i -= 5) {
			System.out.println(i);
		}
		
		int start = 200;
		int end = 0;
		
		while (start > end) {
			start-=5;
			System.out.println(start);
		}
		
		do {
			start-=5;
			System.out.println(start);
		}while(start>end);
	}

}
