package com.pack1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("ram");
		set.add("tom");
		set.add("peter");
		set.add("surya");
		set.add("boon");
		set.add("ram");  //ignores duplicates in SET
		
		for(String str: set){
			System.out.println(str);
			
		}
	}

}
