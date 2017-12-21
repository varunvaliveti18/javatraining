package com.sapient.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmpFileDao implements Idao {

	EmpFileDao() {
	}

	@Override
	public List<String> viewEmployee() {
		List<String> lst = new ArrayList<String>();
		String str = null;
		try {
			FileReader fr = new FileReader("emp.txt");
			BufferedReader br = new BufferedReader(fr);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return lst;
	}

}
