package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;

public class MatchDemo {

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(5);
		lst.add(10);
		lst.add(15);
		lst.add(20);
		lst.add(25);
		lst.add(30);
		
		System.out.println(lst.stream().anyMatch(i -> i%2 == 0 ));
	}

}
