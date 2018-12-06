package com.phuocnguyen017.DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMethod {

	public void getCurrentDateAndTime() {
		// Date Formatting Using SimpleDateFormat
		Date dateNow = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("w W F D E yyyy.MM.dd 'at' hh:mm:ss a zzz ");
		System.out.println("Current Time: " + simpleDateFormat.format(dateNow));
		// Date Formatting Using print-f
		Date dateNow2 = new Date();
		String string = String.format("Current Date/Time: %tc", dateNow2);
		System.out.printf(string);
		// A lot of formats
		System.out.println();
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", dateNow2);
		System.out.println();
		System.out.printf("%s %tB %<te, %<tY", "Due date:", dateNow2);
		System.out.println();
	}

	public void parsingStringIntoDate() {
		// Parsing Strings into Dates
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String input = "1900-11-12 10:20:56";
		Date date;
		try {
			date = simpleDateFormat.parse(input);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void parsingDateIntoString() {
		// Parsing Date into String
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);

	}

	public void sleepingForWhile() {
		// Sleeping for a While

		try {
			System.out.println(new Date() + "\n");
			Thread.sleep(5 * 60 * 10);
			System.out.println(new Date() + "\n");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void measuringElapsedTime() {
		try {
			System.out.println(new Date() + "\n");
			long start = System.currentTimeMillis();
			Thread.sleep(5 * 60 * 10);
			System.out.println(new Date() + "\n");
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference is: " + diff);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void convertCalendarToDate() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println(date);
	}
}
