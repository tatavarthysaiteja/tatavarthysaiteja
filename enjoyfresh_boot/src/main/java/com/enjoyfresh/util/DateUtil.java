package com.enjoyfresh.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.enjoyfresh.constants.Constants;


public class DateUtil {

	private static TimeZone timeZone = null;
	private static SimpleDateFormat dateFormat = null;
	
	static {

		if (timeZone == null) {
			timeZone = TimeZone.getTimeZone(Constants.TIME_ZONE);
		}
		
		dateFormat = new SimpleDateFormat("yyyy-MM-dd H:mm:ss");
		dateFormat.setTimeZone(getTimeZone());
	}

	public static synchronized TimeZone getTimeZone() {
		if (timeZone == null) {
			timeZone = TimeZone.getTimeZone(Constants.TIME_ZONE);
		}
		return timeZone;
	}

	public static String getCurrentDateTime() {
		return dateFormat.format(new Date());
	}
}
