package com.sapient.client;

import com.sapient.service.EmpFact;
import com.sapient.service.Idao;

public class EmpClient {
	
	public static void main(String args[]){
		
		Idao dao = EmpFact.getDaoInstance();
		System.out.println(dao.viewEmployee());
	}

}
