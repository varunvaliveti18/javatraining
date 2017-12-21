package com.sapient.service;

public class Loan extends Account {

	public Loan(int accId, String custName, double bal) {
		super(accId, custName, bal);
	}

	@Override
	public String deposit(double amt) {
		String res = "loan already cleared";
		double bal = 0;
		if (amt <= getBal()) {
			bal = getBal() - amt;
			setBal(bal);
			res = "deposited";
		}
		return res;
	}

}
