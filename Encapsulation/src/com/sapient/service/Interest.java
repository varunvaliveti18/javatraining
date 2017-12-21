package com.sapient.service;

public class Interest {
	private double amt;
	private int years;
	private float rate;
	/* performs simple interest  */
	
		
	public double getAmt() {
		return amt;
	}


	public void setAmt(double amt) throws Exception {
		if(amt < 5000) throw new Exception("amt should be greater than 5000");
		this.amt = amt;
	}


	public int getYears() {
		return years;
	}


	public void setYears(int years) throws Exception{
		if(years <= 0 ) throw new Exception("Years cant be negative");
		this.years = years;
	}


	public float getRate() {
		return rate;
	}


	public void setRate(float rate) throws Exception{
		if(rate<=0 || rate >30) throw new Exception("Rate cant be negative or greater than 30");
		this.rate = rate;
	}

	
	
	
	public double calcSimple(){
		double si = amt * years * rate /100;
		return si;
	}
	
	public double calcCompound(){
		return amt * Math.pow((1 + rate/100), years);
		
	}
	
	public void display(){
		System.out.println(amt + " " + years + " " + rate );
		System.out.println("simple=" + calcSimple() );
		System.out.println(("compound=" + calcCompound()));
	}
}
