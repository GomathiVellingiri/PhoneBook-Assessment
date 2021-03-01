package com.contactDirectory.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class UserResponse {
private String successCode;
private String susscessMessage;
private String failureCode;
private String failureMessage;
public String getSuccessCode() {
	return successCode;
}
public void setSuccessCode(String successCode) {
	this.successCode = successCode;
}
public String getSusscessMessage() {
	return susscessMessage;
}
public void setSusscessMessage(String susscessMessage) {
	this.susscessMessage = susscessMessage;
}
public String getFailureCode() {
	return failureCode;
}
public void setFailureCode(String failureCode) {
	this.failureCode = failureCode;
}
public String getFailureMessage() {
	return failureMessage;
}
public void setFailureMessage(String failureMessage) {
	this.failureMessage = failureMessage;
}


}
