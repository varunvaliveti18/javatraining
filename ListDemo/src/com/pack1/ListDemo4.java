package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo4 {

	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("amar");
		lst.add("birbal");
		lst.add("samant");
		lst.add("nagc");
		
		System.out.println(" iteratoring in forward");
		ListIterator<String> it = lst.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println(" iteratoring in reverse way");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}

	}

}
