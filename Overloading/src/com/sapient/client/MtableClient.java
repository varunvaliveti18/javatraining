package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Mtable;

public class MtableClient {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num");
		int num=scan.nextInt();
		
		try {
			Mtable obj = new Mtable(num);
			obj.display(3,7);
		} catch (Exception e) {
		 System.out.println(e.getMessage());
		}
	
	scan.close();
	}

}
