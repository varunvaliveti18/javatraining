package com.pack1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Adjustersdemo {

	public static void main(String[] args) {
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate ldt =LocalDate.now();
		System.out.println(df.format(ldt.with(TemporalAdjusters.firstDayOfMonth())));
		System.out.println(df.format(ldt.with(TemporalAdjusters.lastDayOfMonth())));
		System.out.println(df.format(ldt.with(TemporalAdjusters.firstDayOfNextMonth())));
		System.out.println(df.format(ldt.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))));
		

	}

}
