package com.oca8.chapter3.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterExamples {

	public static void main(String[] args) {
		// ISO_DATE,ISO_TIME,ISO_DATE_TIME formatter
		LocalDate date = LocalDate.of(2020, Month.MARCH, 13);
		LocalTime time = LocalTime.of(3,15,40);
		LocalDateTime datetime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));	//2020-03-13
		System.out.println(time.format(DateTimeFormatter.ISO_TIME));	//03:15:40
		System.out.println(datetime.format(DateTimeFormatter.ISO_DATE_TIME));	//2020-03-13T03:15:40
		
		//'short' format style 
		DateTimeFormatter shortdtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); // or LocalizedDate() or LocalizedTime()
		//'medium' format style
		DateTimeFormatter mediumdtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortdtf.format(datetime));	//M/D/Y hh:mm  - > 3/13/20 3:15 AM
		System.out.println(mediumdtf.format(datetime));	//MMM DD, YYYY hh:mm:ss AM/PM - > Mar 13, 2020 3:15:40 AM
		/* Note that the UnsupportedTemporalTypeException will be thrown if formatStyle for DateTime is used for 
		 * Date or time printing.
		 */
	//	System.out.println(shortdtf.format(date)); // UnsupportedTemporalTypeException
	//	System.out.println(mediumdtf.format(time)); // UnsupportedTemporalTypeException
		System.out.println(shortdtf.format(datetime));	//M/D/Y  - > 3/13/20
		System.out.println(mediumdtf.format(datetime));	//MMM DD, YYYY HH:MM:SS AM/PM - > Mar 13, 2020 3:15:40 AM
		/* But if you use formatStyle for Date (or) Time is used for 
		 * printing DateTime , the corresponding part will be printed.
		 */
		DateTimeFormatter mediumdateformatter =  DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(mediumdateformatter.format(date)); // Mar 13, 2020
		//System.out.println(mediumdtf.format(time)); // UnsupportedTemporalTypeException
		System.out.println(mediumdtf.format(datetime)); // Mar 13, 2020
		
		// creating new DateTime formatter 
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMM dd, yyyy, hh:mm:ss"); // The more Ms you have, the more verbose the Java output
		System.out.println(datetime.format(f)); // January 20, 2020, 11:12
	}

}
