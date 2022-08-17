package com.devsuperior.springionic.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	String msg;
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
	
}
