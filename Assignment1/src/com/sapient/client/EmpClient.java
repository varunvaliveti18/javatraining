package com.sapient.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.sapient.Exception.IdException;
import com.sapient.Exception.NotFoundException;
import com.sapient.dao.DaoFactory;
import com.sapient.dao.Idao;
import com.sapient.vo.Emp;

public class EmpClient {
	
	static Scanner scan = new Scanner(System.in);
	static Idao dao = DaoFactory.getDaoInstance();

	public static void main(String[] args) {
		String strmenu = null;
		String opt =null;
		Menu emenu = null;
		do{
			System.out.println("Choose :ADD\nEDIT\nREMOVE\nVIEW\nVIEWALL\n ");
			strmenu = scan.next();
			try{
				emenu = Menu.valueOf(strmenu);
				processMenu(emenu);
			}catch(Exception ex){
				System.out.println("invalid menu option");
			}
			System.out.println("press y to continue");
			opt = scan.next();
		}while(opt.equalsIgnoreCase("Y"));
		
	}
	public static void processMenu(Menu menu){
		switch(menu){
		case VIEWALL:
			viewall();
			break;
		case VIEW :
			viewbyId();
			break;
		case ADD :
			add();
			break;
		}
		
	}
	
	public static void viewall(){
		List<Emp> lst = dao.viewEmployee();
		for(Emp emp:lst){
			System.out.println(emp);
		}
	}
	
	public static void viewbyId(){
		System.out.println("Enter Employee Id");
		int eid= scan.nextInt();
		Emp emp;
		try {
			emp = dao.viewEmployee(eid);
			System.out.println(emp);
		} catch (NotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		
		}
	public static void add(){
		System.out.println("Enter Employee id");
		int eid = scan.nextInt();
		System.out.println("Enter Employee name");
		String name = scan.next();
		System.out.println("Enter Employee salary");
		double sal = scan.nextDouble();
		System.out.println("Enter Employee dept id");
		int did = scan.nextInt();
		System.out.println("Enter date(dd-MM-YYYY)");
		String strdt = scan.next();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate obj = LocalDate.parse(strdt,df);
		Emp emp = new Emp(eid,name,sal,did,obj);
		
		try {
			dao.addEmployee(emp);
			System.out.println("EMployee added");
		} catch (IdException e) {
			System.out.println(e.getMessage());
			
		}
	}
	}
	


