package com.sapient.demos;

import java.math.BigInteger;
import java.util.Scanner;

public class CalcFact {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num");
		int num = scan.nextInt();
		BigInteger fact = doFact(num);
		System.out.println("Factorial: " + fact);
		scan.close();
	}
		public static BigInteger doFact(int num){
			BigInteger fact = BigInteger.ONE;
			for (int i=1; i<=num;++i){
				fact = fact.multiply(BigInteger.valueOf(i));
			}
			return fact;
		}
	}


