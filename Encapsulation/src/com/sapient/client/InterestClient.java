package com.sapient.client;

import com.sapient.service.Interest;

public class InterestClient {
	
	public static void main(String args[]){
		Interest intrst = new Interest();
		try{
			intrst.setAmt(10000);
			intrst.setYears(3);
			intrst.setRate(10);
			double si= intrst.calcSimple();
			System.out.println(intrst.getAmt() + " " + intrst.getRate() + " " + intrst.getYears() + " " + si);
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
