package com.sapient.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		String[] arr = {"ram", "amith", "tom","akbar", "birbal"};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("length" + arr.length);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ther string to search");
		String str =scan.next();
		
		int res = Arrays.binarySearch(arr, str);
		if(res >= 0){
			System.out.println("found at index" + res);
		}
		else{
			System.out.println("not found");
		}
	}

}
