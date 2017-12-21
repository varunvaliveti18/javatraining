package com.sapient.service;

public class Savings extends Account {

	public Savings(int accId, String custName, double bal) {
		super(accId, custName, bal);
	}

	

	@Override
	public String deposit(double amt) {
		double bal = getBal() + amt;
		String res = "not deposited";
		if (amt < 50000) {
			setBal(bal);
			res = "deposited";
		}
		return res;
	}
}