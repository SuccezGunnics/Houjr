package com.succez.exception;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * 无参构造器
	 */
	public MyException() {
		super();
	}

	/**
	 * 有参构造器
	 * 
	 * @param message
	 */
	public MyException(String message) {
		super(message);
	}

}
