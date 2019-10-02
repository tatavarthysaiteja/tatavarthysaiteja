package com.enjoyfresh.util;

public class ValChecker {
	public static boolean isEmpty(String val) {
		return (val == null || val.isEmpty()) ? true : false;
	}

	public static boolean isEmptyOrNull(String val) {
		return (val == null || val.isEmpty() || "null".equalsIgnoreCase(val)) ? true : false;
	}
	
	


}

