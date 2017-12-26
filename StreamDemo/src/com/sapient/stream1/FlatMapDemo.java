package com.sapient.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<String> lst1 = Arrays.asList("ram", "tom", "sam");
		List<String> lst2 = Arrays.asList("peter", "john", "mary");
		Stream<List<String>> s = Stream.of(lst1,lst2);
		//s.forEachOrdered(System.out::println);
		Stream<String> s2 =  s.flatMap(lst -> lst.stream());
		s2.forEach(System.out::println);

	}

}
