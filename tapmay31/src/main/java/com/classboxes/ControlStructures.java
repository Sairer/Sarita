package com.classboxes;

import java.util.Scanner;

public class ControlStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter number");
		//scanner.nextInt();
		
		int number=scanner.nextInt();
		scanner.close();
		System.out.println("the number is " + number);
		
		//decision making/non-looping : if-else, switch  
		//looping structures : for, while, do-while, foreach(for)
		
		
		if (number < 100) {  //the condition/expression should return boolean value
			if(number>50 & number<100) {
				System.out.println("the number is greater than 50 and lesser than 100");
		}else {
				System.out.println("the number is less than 50");
			}	
		} else if(number>100 & number <200){ 
			System.out.println("the number is greater than 100 and <200");
		}else {
			System.out.println("number is greather than 200");
		}
		}
	
    

}
	

