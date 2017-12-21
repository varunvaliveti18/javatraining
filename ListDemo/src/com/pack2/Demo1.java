package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		Emp e1 = new Emp(1005, "ram" , 69000);
		Emp e2 = new Emp(1003, "tom" , 59000);
		Emp e3 = new Emp(1007, "amar" , 49000);
		Emp e4 = new Emp(1001, "ravi" , 89000);
		Emp e5 = new Emp(1004, "surya" , 79000);
		
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		lst.add(e5);
		
		Collections.sort(lst);
		System.out.println("sort on employee id-------------------");
		for(Emp emp: lst){
			System.out.println(emp);
		}
		Collections.sort(lst, new NameComparator());
		System.out.println("sort on employee name-------------------");
		for(Emp emp: lst){
			System.out.println(emp); 
		}	
		Collections.sort(lst,new SalComparator());
		System.out.println("sort on employee salary--------------------");
		for(Emp emp: lst){
			System.out.println(emp);
		}
		}
	}


