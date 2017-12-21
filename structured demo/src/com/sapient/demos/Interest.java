package com.sapient.demos;

import java.util.Scanner;

public class Interest {
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		double principle =scan.nextDouble();
		System.out.println("Enter the years");
		int terms = scan.nextInt();
		System.out.println("Enter the rate");
		float per = scan.nextFloat();
		
		double simple = calcSimple(principle,terms,per);
		double comp = calcCompound(principle,terms,per);
		
		System.out.println("Simple Interest\n" + simple);
		System.out.println("Compound Interest\n" + comp);
		scan.close();
	}
	
	public static double calcSimple(double amt, int years, float rate){
		double si = amt + amt*years*rate /100 ;
		return si;
	}
	
	public static double calcCompound(double amt, int years, float rate){
		double ci = amt * Math.pow((1+rate/100),years);
		return ci;
	}

}
