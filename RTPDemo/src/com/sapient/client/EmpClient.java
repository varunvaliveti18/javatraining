package com.sapient.client;

import com.sapient.service.ContractEmp;
import com.sapient.service.Emp;
import com.sapient.service.OnrollEmp;
import com.sapient.service.Product;

public class EmpClient {
	public static void main(String args[]) {
		Emp[] arr = new Emp[4];
		arr[0] = new OnrollEmp(1001, "amar", 23000);
		arr[1] = new OnrollEmp(1002, "rama", 17000);
		arr[2] = new ContractEmp(1003, "ravi", 3000, 5);
		arr[3] = new ContractEmp(1004, "peter", 7000, 3);

		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		System.out.printf("%10s%20s%10s%10s%10s%10s%20s%20s\n", "eid", "ename", "sal", "da", "pf", "days", "NetSal",
				"type");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		for (Emp emp : arr) {
			emp.display();
		}
	}
}
