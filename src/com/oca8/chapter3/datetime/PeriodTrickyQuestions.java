package com.oca8.chapter3.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;

public class PeriodTrickyQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Period w = Period.ofYears(1).ofWeeks(1).ofMonths(5);
		System.out.println(w);    // the last one in the chain will be considered so output is 'P5M'
		
		
		LocalDate date = LocalDate.of(2016, Month.MARCH, 23);
		LocalTime time = LocalTime.of(5, 15, 35);
		LocalDateTime datetime = LocalDateTime.of(date, time);
		System.out.println(date);
		Period p = Period.ofYears(1);
	    date = date.plus(p);
		System.out.println(date);
		datetime = datetime.plus(p);
		System.out.println(datetime);
		time = time.plus(p); // throws java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Years
		System.out.println(time);

	}

}
