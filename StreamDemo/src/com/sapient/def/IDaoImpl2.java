package com.sapient.def;

import java.util.List;

public class IDaoImpl2 implements IDao {

	@Override
	public void m1() {
		System.out.println("impl2  --> m1");
		
	}

	@Override
	public void m2() {
		System.out.println("impl2  --> m2");
		
	}

	@Override
	public void m3(List<String> lst) {
		lst.forEach(System.out::println);
	}

}
