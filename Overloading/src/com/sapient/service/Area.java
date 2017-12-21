package com.sapient.service;

public class Area {
	public static int calcArea(int side){
		System.out.println("int arg");
		return side*side;
	}
	
	public static double calcArea(double side){
		System.out.println("double arg");
		return side *side;
	}
	
	public static void main(String args[]){
		System.out.println(calcArea(5));
		System.out.println(calcArea(10.2));
	}

}
