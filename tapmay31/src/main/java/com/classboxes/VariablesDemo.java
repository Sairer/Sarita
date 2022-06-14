package com.classboxes;



public class VariablesDemo {
   int num1=12;
   double salary = 1000;
    
    
	public static void main(String[] args) {
		VariablesDemo obj1 = new VariablesDemo();
		
		System.out.println(obj1.num1);
		obj1.method1();
		//System.out.println(obj1.num1);
		
		VariablesDemo obj2 = new VariablesDemo();
		//System.out.println(obj2.num1);
		obj1.method2();
	
		
		
		
		
		
}     

	
	
	void method1() {
		int num7=4;
		System.out.println(num7);
		System.out.println(salary);
	}
	
	 void method2() {
		double num8=10.1;
		System.out.println(num8);
		
	}
	}
	
	

