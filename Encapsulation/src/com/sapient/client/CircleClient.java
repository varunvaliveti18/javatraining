package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Circle;

public class CircleClient {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius");
		double rad = scan.nextDouble();
		
		try{
			Circle obj = new Circle(rad);
			double area = obj.calcArea();
			double pm = obj.calcPeri();
			System.out.println("area of circle: " + area);
			System.out.println("peri of circle: " + pm);
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}
