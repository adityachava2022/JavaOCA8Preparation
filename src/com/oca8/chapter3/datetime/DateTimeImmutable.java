package com.oca8.chapter3.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime datetime = LocalDateTime.of(2016, Month.MARCH, 15, 16, 50);
		datetime.plusDays(8);
		System.out.println(datetime);
		
	}

}
