package com.sapient.def;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientA {

	public static void main(String[] args) {
		IDao dao = new DaoImpl3();
		dao.m1();
		dao.m2();
		List<String> lst = Arrays.asList("tom","ram","sam");
		dao.m3(lst);

	}

}
