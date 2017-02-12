package com.oca8.tests.chapter3;

import java.time.LocalDateTime;
import java.time.format.FormatStyle;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Chapter3RQ32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f));
	}

}
