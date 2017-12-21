package com.sapient.service;

public class OnrollEmp extends Emp {
	private double da;
	private double pf;

	public OnrollEmp(int empId, String eName, double sal) {
		super(empId, eName, sal);
		da = calcDa();
		pf = calcPf();
	}

	private double calcPf() {
		return getSal() * 0.12;
	}

	private double calcDa() {
		return getSal() * 0.4;
	}

	@Override
	public void display() {

		super.display();
		System.out.printf("%10.2f%10.2f%30.2f%20s\n", da, pf, calcSal(), getClass().getSimpleName());
	}

	@Override
	public double calcSal() {
		return getSal() + da - pf;

	}

}
