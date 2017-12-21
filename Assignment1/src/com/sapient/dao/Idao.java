package com.sapient.dao;

import java.util.List;

import com.sapient.Exception.IdException;
import com.sapient.Exception.NotFoundException;
import com.sapient.vo.Emp;

public interface Idao {
	
	List<Emp> viewEmployee();
	Emp viewEmployee(int eid) throws NotFoundException;
	int addEmployee(Emp emp)throws IdException;
	int removeEmployee(int eid) throws NotFoundException;
	int updateSalary(int eid,double sal) throws NotFoundException;

}
