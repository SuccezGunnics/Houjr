package com.succez.utils;

public class Result {

	private Object resultObj;
	private long runTime;

	public Result(Object resultObj, long runTime) {
		super();
		this.resultObj = resultObj;
		this.runTime = runTime;
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
