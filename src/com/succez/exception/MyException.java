package com.succez.exception;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * �޲ι�����
	 */
	public MyException() {
		super();
	}

	/**
	 * �вι�����
	 * 
	 * @param message
	 */
	public MyException(String message) {
		super(message);
	}

}
