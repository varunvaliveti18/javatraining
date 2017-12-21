package com.sapient.service;

public class Mtable {

	private int num;

	public Mtable(int num) throws Exception {
		super();
		if (num <= 0)
			throw new Exception("Number must be positive");
		this.num = num;
	}

	public void display(int start, int end) throws Exception{
		if (end > 0 && start > 0 && end >= start)
			showTable(start, end);
		else throw new Exception("start and end must be positive and end >= start");
	}

	public void display() {
		showTable(1, 10);
	}

	public void display(int rows) {
		showTable(1, rows);
	}

	private void showTable(int start, int end) {
		for (int i = start; i <= end; ++i) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
	}

}
