package com.phuocnguyen017.DateAndTime;

import java.util.Calendar;

public class TimeDate {
	public static void main(String[] args) {
		TimeDate timeDate = new TimeDate();
		timeDate.dateShow();
	}

	public void dateShow() {
		Calendar calendar = Calendar.getInstance();
		/* increase hour by 1 and date by 1 */
		calendar.add(Calendar.HOUR, 1);
		calendar.add(Calendar.DATE, 1);
		//
		System.out.println("Time for tomorrow:");
		System.out.print(calendar.getTime());
	}
}
