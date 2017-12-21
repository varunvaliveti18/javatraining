package com.pack1;

import java.util.ArrayList;
import java.util.List;

public class ListDemo5 {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("amar");
		lst.add("birbal");
		lst.add("samant");
		lst.add("nagc");
		System.out.println(lst);
		lst.add(2,"vikas");
		System.out.println(lst);
		System.out.println(lst.remove(3));
		System.out.println(lst);
		System.out.println(lst.remove("amar"));
		System.out.println(lst);
		System.out.println("size: " + lst.size());
		System.out.println("get at idx 2 :" + lst.get(2));
		
		List<String> lst2 = new ArrayList<>();
		lst2.add("varun");
		lst2.add("tarun");
		lst2.addAll(lst);
		System.out.println(lst2); 

	}

}
