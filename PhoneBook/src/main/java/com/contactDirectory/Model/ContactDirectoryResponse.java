package com.contactDirectory.Model;

public class ContactDirectoryResponse {
	private String success;

	private String successCode;
	private String failure;
	private int failureCode;
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccessCode() {
		return successCode;
	}
	public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}
	public String getFailure() {
		return failure;
	}
	public void setFailure(String failure) {
		this.failure = failure;
	}
	public int getFailureCode() {
		return failureCode;
	}
	public void setFailureCode(int failureCode) {
		this.failureCode = failureCode;
	}
	
}
