package com.classboxes;



public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int empArray[]=new int[10];
		empArray[0]=104;  
		empArray[1]=101;
		empArray[2]=105;
		empArray[3]=102;
		
		System.out.println(empArray[2]);  //105
		System.out.println(empArray[5]);  //0 
		System.out.println(empArray[9]);  // 0
		
		int data[]= {34,56,43,78,21,980,234};
		System.out.println(data[5]);//980
		
		System.out.println(empArray.length);//10
		System.out.println(data.length);//7
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+ "\t");
		}
			System.out.println();
			System.out.println("xxxxx");
		for (int i = 0; i < empArray.length; i++) {
			System.out.println(empArray[i]);
		}
		for (int i : data) {
			System.out.println(i);
			
		}
		System.out.println("yyyyyyyyyy");
		int arr1[][]= {{341,562},{432,781,121},{980,234}};  //2-D
		System.out.println(arr1[1][2]);  
		
		for (int[] is : arr1) {
			for (int is2 : is) {
				System.out.print(is2 + "\t");
			}
		}
		
		}
					
}




