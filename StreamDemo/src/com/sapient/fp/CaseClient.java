package com.sapient.fp;

public class CaseClient {
	/*
	 * demo On - functional programming
	 */
	public static void main(String[] args) {
		//ICase lower = s -> s.toLowerCase();
		//ICase upper = (String s) -> {return s.toUpperCase();};
		display(s ->s.toLowerCase(),"RamA");
		display(s ->s.toUpperCase(),"RamA");

	}

	public static void display(ICase obj, String str) {
		String res = obj.changeCase(str);
		System.out.println( res);

	}

}
