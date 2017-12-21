package com.sapient.wrapper;

public class Boxing {

	public static void main(String[] args) {
		Integer a = 10;  //autoboxing
		Integer b = new Integer(20);  //boxing
		int res = a.intValue() + b.intValue();  //unboxing
		
		Integer c = Integer.valueOf(res);
		System.out.println(c);

	}

}
