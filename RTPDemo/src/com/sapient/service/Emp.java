package com.sapient.service;

public abstract class Emp {
	private int empId;
	private String eName;
	private double sal;

	public Emp(int empId, String eName, double sal) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}

	public void display() {
		System.out.printf("%10d%20s%10.2f", empId, eName, sal);
	}

	public abstract double calcSal();

}
