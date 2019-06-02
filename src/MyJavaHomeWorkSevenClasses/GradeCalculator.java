package MyJavaHomeWorkSevenClasses;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please write Student Name: ");
		String studentName = userInput.nextLine();
		
		System.out.println("Please write Student Grade ");
					
		int grade = userInput.nextInt();

		if(grade >= 85 && grade <105) {
			System.out.println("the grade is greater than 85 the grade will be “A”");
						}
		if (grade >= 75 && grade <85) {
				System.out.println("greater than 75 will be “B””");
				}
		if(grade >= 65 && grade <75) {
					System.out.println("greater than 65 will be “C”");
					}
		if(grade >= 55 && grade <65 ) {
						System.out.println("greater than 55 will be “D”");
					}
		if(grade <= 55 && grade >= 0) {
						System.out.println("less than 55 will be “F”");
			}else{
				System.out.println("Please put correct Grade ");
				};
				}
					
//		Assignment 1 : 
//			Please create an application class called GradeCalculator in com.codistan.java.loopassignments package. 
//			This application will ask for Student Name and then it will ask for the exam points he got 
//			and the application will calculate his/her grade based on the points as following and print it to the console; 
//					if the grade is greater than 85 the grade will be “A”, 
//				greater than 75 will be “B”, greater than 75 will be “B” greater than 55 will be “D” and 55 and less will be “F”.
//	
	
	

}


