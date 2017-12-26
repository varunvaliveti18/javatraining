package com.sapient.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindDemo {

	public static void main(String[] args) {
		List<String> lst1 = Arrays.asList("ram", "sam", "tom", "rajan", "rakesh", "suresh", "sanjeev");
		Optional<String> opt = lst1.stream().filter(s -> s.startsWith("t")).findAny();
		System.out.println(opt);
		if(opt.isPresent())
			System.out.println("element found");
		else
			System.out.println("not found");

	}

}
