package com.sapient.service;

public class Circle {

		private double radius;
		
	    
		public Circle(double radius) throws Exception {
			super();
			if (radius <=0)
				throw new Exception("radius must be greater than zero");
			this.radius = radius;
		}

		public double calcArea(){
			double area = Math.PI * radius * radius;
			return area;
		}
		
		
		public double calcPeri(){
			double pmtr = 2 * Math.PI * radius ;
			return pmtr;
		}
	
}
