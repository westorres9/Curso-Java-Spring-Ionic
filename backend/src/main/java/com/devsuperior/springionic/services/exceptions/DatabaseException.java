package com.devsuperior.springionic.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	String msg;
	
	public DatabaseException(String msg) {
		super(msg);
	}

}
