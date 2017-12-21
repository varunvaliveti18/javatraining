package com.sapient.service;

public class ContractEmp extends Emp{
private int days;

public ContractEmp(int empId, String eName, double sal, int days) {
	super(empId, eName, sal);
	this.days = days;
}

@Override
public void display() {
	
	super.display();
	System.out.printf("%30d%20.2f%20s\n",days,calcSal(),getClass().getSimpleName());
}

@Override
public double calcSal() {
 	return days * getSal();
}


}
