package com.classboxes;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
	    //Assignment 2:    JavaSE application to make a Simple Calculator using switch...case
		//should be able to add, subtract, multiply and divide two numbers. Scan the two numbers and operator using Scanner class.
		
		char operator;   //declaring variable
	    int number1, number2, result;   // declaring variables
	    System.out.print("Enter first number ");
	    Scanner scanner = new Scanner(System.in);// creating scanner object
	    number1 = scanner.nextInt();
	    System.out.print("Please enter the operator ");
	    operator= scanner.next().charAt(0);
	    System.out.print("Enter second number ");
	    number2 = scanner.nextInt();
	    scanner.close();
	    
	    switch (operator) {
	      case '+':
	        result = number1 + number2;
	        System.out.println("The sum of the two numbers is : " + result);
	        break;
	      case '-':
	        result = number1 - number2;
	        System.out.println("The subtraction of the two numbers is : " + result);
	        break;
	      case '*':
	        result = number1 * number2;
	        System.out.println("The multiplication of the two numbers is : " + result);
	        break;
	      case '/':
	        result = number1 / number2;
	        System.out.println("The division of the two numbers is : " + result);
	        break;
	       default:
	    	   System.out.println("Invalid operator");
        }
	}
	

}
