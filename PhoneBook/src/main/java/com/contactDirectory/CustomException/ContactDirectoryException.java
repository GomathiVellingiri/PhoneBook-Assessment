package com.contactDirectory.CustomException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.contactDirectory.Model.ErrorCode;
import com.contactDirectory.Model.UserResponse;

public class ContactDirectoryException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private List<Error> errors;

	public ContactDirectoryException(String msg) {
		super(msg);
		System.out.println(" ERROR ---- : " + msg);
}

	public ContactDirectoryException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public <T> ResponseEntity<T> getResponse() {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	public ContactDirectoryException() {
	}
	public ContactDirectoryException(ErrorCode code, String errorMsg) {
		super(code.toString());
		Error error = new Error(errorMsg);
		errors = new ArrayList<Error>();
		errors.add(error);
	}

	public ContactDirectoryException(ErrorCode code, Exception cause) {
		super(code.toString(), cause);
		if (code != null) {
			errors = new ArrayList<Error>();
			Error error = new Error(cause.getMessage());
			errors.add(error);
		}
		cause.printStackTrace();
	}

	public ContactDirectoryException(List<Error> errors) {
		this.errors = errors;
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}


}
