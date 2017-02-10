package com.oca8.chapter3.datetime;

import java.time.*;
public class DateTimeManipulation {

	public static void main(String[] args)
	{
		
		LocalDate date1 = LocalDate.of(2016, Month.FEBRUARY, 11);
		System.out.println(date1);
		date1 = date1.plusDays(2);  // the argument is long
		System.out.println(date1);
		date1 = date1.plusWeeks(2); // the argument is long
		System.out.println(date1);
		date1 = date1.plusMonths(2); // the argument is long
		System.out.println(date1);
		date1 = date1.plusYears(2); // the argument is long
		System.out.println(date1);
		
		/* minus also has the same*/
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime); // 2020-01-20T05:15
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); // 2020-01-19T05:15
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); // 2020-01-18T19:15
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); // 2020-01-18T19:14:30
		
	}

}
