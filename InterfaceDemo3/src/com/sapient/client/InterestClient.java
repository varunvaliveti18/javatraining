package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Interest;

public class InterestClient {

	public static void main(String[] args) {
		
		Interest obj = Calculator.getInterest();
		System.out.println(obj.calcSimple(5000, 2, 2.5f));
		System.out.println(obj.calcCompound(5000, 2, 2.5f));
		System.out.println(obj.convert2Binary(12));
		System.out.println(obj.doSum(6,8,10,12));
		System.out.println(obj.doAvg(6,8,10,12));
	

	}

}
