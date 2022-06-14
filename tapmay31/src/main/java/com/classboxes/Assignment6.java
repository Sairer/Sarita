package com.classboxes;

import java.util.StringJoiner;

public class Assignment6 {
int num1=555;
	public static void main(String[] args) {
		Assignment6 ass = new Assignment6();
		ass.method();
		
		StringJoiner joiner=new StringJoiner("-","{","}");  //joins the strings with delimeter, prefix and suffix
		joiner.add("hi");  //introduced in java8
		joiner.add("hello");
		joiner.add("String Joiner");
		joiner.add("bye");
		joiner.hashCode();
		System.out.println(joiner);
		System.out.println("*****non-repeating char****");
		//printing non-repeating characters of a string
		String message = joiner.toString();  //StringJoiner into String
		int length=joiner.length();
		System.out.println(message);
		char[] charArray = message.toCharArray();  //string to char array
		for (char character : charArray) {  //for-each to extract the characters from charArray 
			if(message.indexOf(character)==message.lastIndexOf(character)) {
				System.out.println(character);
			}
		}
		
	
	}
	void method(){
		 System.out.println(num1);
	}
}
