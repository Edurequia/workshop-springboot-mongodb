package com.nelioalves.workshopmongo.services.exception;

public class ObjectNotfFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ObjectNotfFoundException(String msg) {
		super(msg);
	}
	
}
