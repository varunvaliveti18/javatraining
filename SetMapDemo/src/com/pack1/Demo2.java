package com.pack1;

import java.util.HashSet;
import java.util.Set;

import com.pack1.Emp;

public class Demo2 {

	public static void main(String[] args) {
		Emp e1 = new Emp(1005, "ram" , 69000);
		Emp e2 = new Emp(1003, "tom" , 59000);
		Emp e3 = new Emp(1007, "amar" , 49000);
		Emp e4 = new Emp(1001, "ravi" , 89000);
		Emp e5 = new Emp(1004, "surya" , 79000);
		Emp e6 = new Emp(1005, "ram" , 69000);
		Emp e7 = e2;
		
		Set<Emp> set = new HashSet<Emp>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		
		for(Emp emp: set){
			System.out.println(emp);
		}

	}

}
