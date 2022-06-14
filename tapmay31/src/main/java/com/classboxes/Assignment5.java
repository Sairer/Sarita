package com.classboxes;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		
		          // Assignment 5:  Print all prime numbers between 1 to n, only if it is part of the Fibonacci series. For example:
				 //n value is 10, 1 to 10 prime numbers are : 2, 3, 5, 7. Fibonacci series : 0, 1, 1, 2, 3, 5, 8,... output is: 2,3,5
				
		int num;
		char option;
		System.out.print("enter number ");
		Scanner scan = new Scanner(System.in);
		num=scan.nextInt();
		
			for (int number = 1; number <=10; number= number+2) {
				num=number +2;
			}
			int number = 0;
			if (number %2==0) {
				
			} else {

			}
			   System.out.print("Do you want to continue y/n? ");
	            option = scan.next().charAt(0);
	            

	}

}
