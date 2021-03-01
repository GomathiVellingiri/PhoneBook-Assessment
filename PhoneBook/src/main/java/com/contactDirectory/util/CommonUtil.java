package com.contactDirectory.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtil {
	public static boolean validateMobileNumber(String mobileNumber) {
		String regex = "^\\d{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	public static boolean isValidEmailAddress(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		Boolean b = email.matches(ePattern);
		return b;
	}
	public static String isNullOrEmpty(String s) {
		if (s == null) {
			return "null";
		} else if (s.trim().isEmpty()) {
			return "empty";
		} else {
			return "valid";
		}
	}

}
