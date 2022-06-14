package com.classboxes;

import java.util.Scanner;

public class Assignment1{

	public static void main(String[] args) {
		
		/* Assignment 1:  JavaSE application to generate Electricity bill   (use if-else-if ladder)
		inputs are old reading and current reading and generate the bill by following  slabs/ranges: Scan the inputs using Scanner class
		0-50: Rs.1
		50-100: Rs2
		100-200: Rs.3
		200-400: Rs.4
		>400: Rs.5
		example if the number of units are 120 then the consumption charge is (50*1)+(50*2)+(20*3)=Rs.210 
		*/
		//creating scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter number of units: ");
		 //  declare variable units    
		int units=scanner.nextInt();
		 scanner.close();
	    //  declare variable billToPay    
		int billToPay= 0;
		
		
		
	if (units>0 & units<50) { // check whether units are between 0 and 50  
		billToPay=units * 1 ;
		System.out.println("Bill to pay is " + billToPay);
	}else if(units>50 & units <100){  // check whether units are between 50 and 100  
		billToPay= (units*1)+ (units * 2) ;
		System.out.println( "Bill to pay is " + billToPay);
	}else if (units>100 & units<200) { // check whether units are between 100 and 200  
		billToPay=(units *1)+ (units*2)+(units * 3) ;
		System.out.println("Bill to pay is " + billToPay);
	}else if (units>200 & units<400) { // check whether units are between 200 and 400  
		billToPay= (units *1)+ (units*2)+(units * 3)+ (units * 4) ;
		System.out.println("Bill to pay is " + billToPay);
	}else if(units > 400) {   // check whether units are greater than 400  
			billToPay= (units *1)+ (units*2)+(units * 3)+ (units * 4) +(units * 5) ;
			System.out.println("Bill to pay is : " + billToPay); 
	}else {
		System.out.println("units is out of the range");
		}

	}

}
