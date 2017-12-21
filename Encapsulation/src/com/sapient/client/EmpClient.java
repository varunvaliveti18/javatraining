package com.sapient.client;

import com.sapient.service.Emp;

public class EmpClient {
	public static void main(String args[]) {
		Emp emp = new Emp();
		try {
			emp.setName("ABC");
			emp.setAge(56);
			System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getBusunit());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
