package com.sapient.arr;

import java.util.Arrays;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {
		String[] arr = new String[4];
		arr[0] = "ram";
		arr[1] = "anand";
		arr[2] = "vikas";
		arr[3] = "peter";
		
		Arrays.sort(arr);
		for(String str: arr){
			System.out.println(str);	
		}
		
		System.out.println("descending order");
		Arrays.sort(arr,Collections.reverseOrder());
		for(String str: arr){
			System.out.println(str);

	}

	

}
}