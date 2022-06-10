package com.classboxes;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		// Assignment 3:   Java SE code that reads a set of integers, and then prints the sum of the even and odd integers separately
		 Scanner input = new Scanner(System.in);
		 
	        int number;
	        char option;
	        int even = 0;
	        int odd = 0;
	 
	        do
	        {
	            System.out.print("Enter any number ");
	            number = input.nextInt();
	            if( number % 2 == 0)
	            {
	                even= even+number;
	            }
	            else
	            {
	                odd= odd + number;
	            }
	 
	            System.out.print("Do you want to continue y/n? ");
	            option = input.next().charAt(0);
	            
	            
	        }while(option=='y');
	        
	        System.out.println("Sum of even numbers: " + even);
	        System.out.println("Sum of odd numbers: " + odd);
	}

}
