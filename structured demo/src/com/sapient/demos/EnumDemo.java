package com.sapient.demos;

import java.util.Scanner;

public class EnumDemo {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first value");
		int v1 = scan.nextInt();
		System.out.println("Enter second value");
		int v2= scan.nextInt();
		System.out.println("Choose 1 --- add\n 2---sub\n 3---Multiply");
		String str = scan.next();
		Menu menu =Menu.valueOf(str);
		switch(menu){
		case ADD:
			System.out.println("Add  " + (v1 + v2));
			break;
		case SUB:
			System.out.println("SUB  " + (v1 - v2));
			break;
		case MULTIPLY:
			System.out.println("MULTIPLY  " + (v1 * v2));
			break;
			default:
				System.out.println("invalid menu option");
		}
	}

}

enum Menu{
	ADD,SUB,MULTIPLY
}
 