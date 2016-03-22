package com.succez.utils;

public class Result {

	private Object resultObj;
	private long runTime;
	private boolean isSuccessful;
	private String exceptionType;
	
	public Result() {
		super();
	}

	public Result(Object resultObj, long runTime) {
		super();
		this.resultObj = resultObj;
		this.runTime = runTime;
	}

	public Result(Object resultObj, long runTime, boolean isSuccessful,
			String exceptionType) {
		super();
		this.resultObj = resultObj;
		this.runTime = runTime;
		this.isSuccessful = isSuccessful;
		this.exceptionType = exceptionType;
	}



	public boolean isSuccessful() {
		return isSuccessful;
	}

	public void setSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

	public String getExceptionType() {
		return exceptionType;
	}

	public void setExceptionType(String exceptionType) {
		this.exceptionType = exceptionType;
	}

	public Object getResultObj() {
		return resultObj;
	}

	public void setResultObj(Object resultObj) {
		this.resultObj = resultObj;
	}

	public long getRunTime() {
		return runTime;
	}

	public void setRunTime(long runTime) {
		this.runTime = runTime;
	}

}
