package com.contactDirectory.Model;

public class Error {

	private String errorCode;
	private String errorMsg;

	public Error() {
	}

	public Error(ErrorCode errorCode) {
		this.errorCode = errorCode.toString();
	}

	public Error(ErrorCode errorCode, String errorMsg) {
		this.errorCode = errorCode.toString();
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
