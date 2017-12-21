package com.pack1;

import com.pack1.Emp;

public class Emp implements Comparable<Emp>{
	
	private int empId;
	private String ename;
	private double sal;
	public Emp(int empId, String ename, double sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}
	
	
	
	public int getEmpId() {
		return empId;
	}



	public String getEname() {
		return ename;
	}



	public double getSal() {
		return sal;
	}

	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp)obj;
		if(this.empId == emp.empId ) return true;
		else return false;
	}



	@Override
	public int hashCode() {
		
		return empId;
	}

	@Override
	public String toString() {
		
		return empId + " " + ename + " " + sal;
	}
	@Override
	public int compareTo(Emp emp) {
		Integer e1 = this.empId; 
		Integer e2 = emp.empId;
		return e1.compareTo(e2);
	}
	
	

}
