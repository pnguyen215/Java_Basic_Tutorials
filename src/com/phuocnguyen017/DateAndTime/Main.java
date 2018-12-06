package com.phuocnguyen017.DateAndTime;

public class Main {

	public static void main(String[] args) {

		DateMethod dateMethod = new DateMethod();
		CalendarMethod calendarMethod = new CalendarMethod();

		calendarMethod.getCurrentDateTime();
		calendarMethod.handleCalendar();
		calendarMethod.setDateManually();
		calendarMethod.parsingDateToCalendar();

		dateMethod.convertCalendarToDate();
		dateMethod.parsingDateIntoString();
		dateMethod.parsingStringIntoDate();
		dateMethod.convertCalendarToDate();
	}
}
