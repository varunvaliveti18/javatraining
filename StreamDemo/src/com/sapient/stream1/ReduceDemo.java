package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		Integer res = lst.stream().map(i->i).reduce(0,(x,y)->x+y);
		System.out.println("sum of all elements" + res);
		Integer res1 = lst.stream().filter(i-> i%2==0 ).map(i ->i).reduce(0,(x,y)->x+y);
		System.out.println("sum of all elements" + res1);
	}

}
