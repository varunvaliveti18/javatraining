package com.sapient.demos;

public class VarArgsDemo {
	
	public static void main(String args[]){
		int res = sum(2,12);
		System.out.println(res);
	}
	
	public static int sum(int ...arr){
	
		System.out.println("varargs called");
		int sum=0;
		for(int i=0; i<arr.length; ++i )
		sum =sum+arr[i];
		return sum;
	}

}
