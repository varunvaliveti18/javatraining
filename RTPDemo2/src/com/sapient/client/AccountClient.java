package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Account;
import com.sapient.service.Loan;
import com.sapient.service.Savings;

public class AccountClient {
	private static Account[] arr = new Account[2];
	static {
		arr[0] = new Savings(1001, "ram", 5000);
		arr[1] = new Loan(1002, "amit", 25000);

	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String opt = null;
		int acctype = 0;
		double amt = 0;

		do {
			System.out.println("Enter Account type 0 -- savings, 1--- loan");
			acctype = scan.nextInt();
			if (acctype < 0 || acctype > 1) {
				System.out.println("Invalid acctype");
			} else {
				System.out.println("Enter amount to deposit");
				amt = scan.nextDouble();
				arr[acctype].deposit(amt);
				arr[acctype].display();
				System.out.println("pressn Y to continue");
				opt = scan.next();
			}
		} while (opt.equals("Y"));
		scan.close();
	}
}
