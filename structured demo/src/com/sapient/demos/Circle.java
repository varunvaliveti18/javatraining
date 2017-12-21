package com.sapient.demos;

import java.util.Scanner;

public class Circle {
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		float rad =scan.nextFloat();
		
		double area1 = calcArea(rad);
		double perim = calcPerimeter(rad);
		
		System.out.println("Area of Circle\n" + area1);
		System.out.println("Perimeter\n" + perim);
		scan.close();
	} 


public static double calcArea( float radius){
	double carea = Math.PI * radius * radius ;
	return carea;
}

public static double calcPerimeter(float radius){
	double cperi = 2*Math.PI*radius;
	return cperi;
}

}
