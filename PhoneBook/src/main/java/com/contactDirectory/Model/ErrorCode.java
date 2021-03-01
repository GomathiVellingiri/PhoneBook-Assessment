package com.contactDirectory.Model;

public enum ErrorCode {
	FROM_DATE_SHOULD_NOT_BE_NULL("CON.0.0.1"), TO_DATE_SHOULD_NOT_BE_NULL("CON.0.0.2");

	private final String name;

	private ErrorCode(String str) {
		name = str;
	}

	public boolean equalsName(String content) {
		return (content == null) ? false : name.equals(content);
	}

	public String toString() {
		return name;
	}
}
