package com.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListDemo2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("amar");
		lst.add("birbal");
		lst.add("samant");
		lst.add("nagc");

		Collections.sort(lst);

		for (String str : lst) {
			System.out.println(str);
		}
		System.out.println("Descending order");
		Collections.sort(lst, Collections.reverseOrder());
		System.out.println(lst);
	}
}