package phuocnguyen017.DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarMethod {

	public void calendarAndDate() {
		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		int year = gregorianCalendar.get(Calendar.YEAR);
		System.out.print("Date: ");
		System.out.print(months[gregorianCalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gregorianCalendar.get(Calendar.DATE) + " ");
		System.out.println(year);
		System.out.print("Time: ");
		System.out.print(gregorianCalendar.get(Calendar.HOUR) + ":");
		System.out.print(gregorianCalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gregorianCalendar.get(Calendar.SECOND));
		System.out.println("#Yesterday ");
		System.out.print("Date: ");
		System.out.print(months[gregorianCalendar.get(Calendar.MONTH)]);
		gregorianCalendar.add(Calendar.DAY_OF_MONTH, -1); // current date - 1 or "day-of-month" - 1
		System.out.print(" " + gregorianCalendar.get(Calendar.DATE) + " ");
		System.out.println(year);
		// Check is LeapYear
		if (gregorianCalendar.isLeapYear(year)) {
			System.out.println("The current year is a leap year!");
		} else {
			System.out.println("The current year is not a leap year!");
		}
	}

	public void getCurrentDateTime() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MMM dd  HH:mm:ss");
		Calendar calendar = new GregorianCalendar();
		System.out.print("Current Date/Time: ");
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		System.out.print("Time Zone: ");
		System.out.println(calendar.getTimeZone());
		System.out.print("Calendar Type: ");
		System.out.println(calendar.getCalendarType());
	}

	public void handleCalendar() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

		int hour = calendar.get(Calendar.HOUR); // 12 hour clock
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);

		System.out.println(simpleDateFormat.format(calendar.getTime()));

		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);

		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);
	}

	public void parsingDateToCalendar() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		String dateString = "2020 08 10 10:08:10";
		try {
			Date date = simpleDateFormat.parse(dateString);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			System.out.println(calendar.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public void setDateManually() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2013, 1, 28, 13, 24, 56);
		System.out.println("#1. " + simpleDateFormat.format(calendar.getTime()));
		// update a date
		calendar.set(2014, 10, 23); // year, month, date
		// Month: January -> 0, December -> 11
		System.out.println("#2. " + simpleDateFormat.format(calendar.getTime()));
	}
}
