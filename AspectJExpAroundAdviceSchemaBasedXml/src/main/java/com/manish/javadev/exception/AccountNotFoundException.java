package com.manish.javadev.exception;

public class AccountNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public AccountNotFoundException() {

	}

	public AccountNotFoundException(String exception) {
		super(exception);
	}
}