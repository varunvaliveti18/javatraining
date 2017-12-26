package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("vasu");
		lst.add("amar");
		lst.add("sai");
		lst.add("pandit");
		lst.add("dimpal");
		
		//lst.stream().sorted().forEach(System.out::println);
		
		System.out.println("ascending order");
		Stream<String> s = lst.stream().sorted();
		s.forEachOrdered(System.out::println);
		System.out.println("descending order");
		lst.stream().sorted((i,j) -> j.compareTo(i)).forEach(System.out::println);
	}

}
