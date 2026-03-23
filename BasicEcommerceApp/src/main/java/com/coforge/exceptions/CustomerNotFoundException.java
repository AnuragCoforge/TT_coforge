package com.coforge.exceptions;

public class CustomerNotFoundException  extends RuntimeException{

	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
