package com.sapient.service;

public class Emp {
	
	private String name;
	private int age;
	private String busunit = "RazorFish";
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception{
		if(!name.matches("[a-z A-z]{3,15}"))
			throw new Exception("name must contain 3-15 alphabets");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if(age <18 || age>60)
			throw new Exception("age must be between 18 and 60");
		this.age = age;
	}
	public String getBusunit() {
		return busunit;
	}
	
	

}
