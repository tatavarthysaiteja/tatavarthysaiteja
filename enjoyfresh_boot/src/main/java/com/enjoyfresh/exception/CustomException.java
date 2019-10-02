package com.enjoyfresh.exception;

import com.enjoyfresh.constants.Messages;

public class CustomException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private Messages code;
	
	public CustomException() {
		super();
	}
	
	public Messages getCode() {
		return code;
	}
	
	public CustomException(String message) {
		super(message);
	}

	public CustomException(Messages msg) {
		super(msg.getValue());
		this.code = msg;
	}

	
}
