package com.oca8.chapter3.datetime;

import java.time.*; 

public class DateTimeAPI {

	public static void main(String[] args)
	{
		// it depends on the time and date and the locale
		System.out.println(LocalDate.now());  // sample output 2017-02-10		YYYY-MM-DD
		System.out.println(LocalTime.now());  // sample output 21:30:45.733
		System.out.println(LocalDateTime.now()); // sample output 2017-02-10T21:30:45.734 hereJava uses T to
												//separate the date and time when converting LocalDateTime to a String
		/*
		 * public static LocalDate of(int year, int month, int dayOfMonth)
		 * public static LocalDate of(int year, Month month, int dayOfMonth)
		 * 'Month' is an enum
		 */
		LocalDate date1 = LocalDate.of(2017, Month.FEBRUARY, 10);
		LocalDate date2 = LocalDate.of(2017, 1, 10);
		//LocalDate date3 = LocalDate.of(2015, 16, 10);// throws java.time.DateTimeException
		//LocalDate date4 = LocalDate.of(2015, 1, 40); // throws java.time.DateTimeException
		
		/*
		 *  public static LocalTime of(int hour, int minute)
		 *	public static LocalTime of(int hour, int minute, int second)
		 *	public static LocalTime of(int hour, int minute, int second, int nanos)
		 */
		LocalTime time1 = LocalTime.of(9, 45);
		LocalTime time2 = LocalTime.of(9, 45, 30);
		LocalTime time3 = LocalTime.of(9, 40, 25, 200);
		LocalTime time4 = LocalTime.of(56, 90);	//java.time.DateTimeException: Invalid value for HourOfDay (valid values 0 - 23): 56
		LocalTime time5 = LocalTime.of(21, 90);	//java.time.DateTimeException: Invalid value for MinuteOfHour (valid values 0 - 59): 90
		LocalTime time6 = LocalTime.of(21, 56, 70);	//java.time.DateTimeException: Invalid value for SecondOfMinute (valid values 0 - 59): 70
		/*
		 *  public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute)
		 *	public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second)
		 *	public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second, int nanos)
		 *	public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute)
		 *	public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute, int second)
		 *	public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute, int second, int nanos)
		 *	public static LocalDateTime of(LocalDate date, LocalTime time)
		 */
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		
		/* 
		 * Does not compile since these classes have a private constructors so hence we should use static methods
		 */
		//LocalDate d = new LocalDate(); // DOES NOT COMPILE
	}

}
