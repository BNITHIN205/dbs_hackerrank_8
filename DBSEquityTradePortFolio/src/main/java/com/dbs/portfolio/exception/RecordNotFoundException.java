package com.dbs.portfolio.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class RecordNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String  exceptionMessage;

	public RecordNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public RecordNotFoundException(String exceptionMessage) {
		this.exceptionMessage=exceptionMessage;
		// TODO Auto-generated constructor stub
	}
	

}
